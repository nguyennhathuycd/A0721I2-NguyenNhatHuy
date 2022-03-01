package com.codegym.repository;

import com.codegym.model.Music;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class MusicRepository implements IMusicRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Music> findAll() {
        TypedQuery<Music> query = em.createQuery("select m from Music m", Music.class);
        return query.getResultList();
    }

    @Override
    public Music findOne(Long id) {
        TypedQuery<Music> query = em.createQuery("select m from Music m where  m.id=:id", Music.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void save(Music music) {
        if (music.getId() != null) {
            em.merge(music);
        } else {
            em.persist(music);
        }
    }

    @Override
    public void remove(Long id) {
        Music music = findOne(id);
        if (music != null) {
            em.remove(music);
        }
    }
}

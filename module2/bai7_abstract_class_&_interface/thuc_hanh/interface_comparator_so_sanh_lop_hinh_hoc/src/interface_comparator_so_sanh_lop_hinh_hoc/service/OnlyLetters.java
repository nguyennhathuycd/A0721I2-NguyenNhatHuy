package interface_comparator_so_sanh_lop_hinh_hoc.service;

public final class OnlyLetters {
    public boolean isOnlyLetters(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if (Character.isLetter(arr[i]) == false){
                return false;
            }
        }
        return true;
    }
}

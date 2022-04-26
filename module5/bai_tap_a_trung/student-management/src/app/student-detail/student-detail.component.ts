import { Component, OnInit } from '@angular/core';
import {IStudent} from '../models/IStudent';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {
  student: IStudent = {
    id: '1',
    name: 'Việt Hoàng',
    age: 22,
    mark: 10,
    avatar: 'data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxMTEhUSExMWFRUWFxoYGRcYGBUVFRcdFRcXFxcVGhUYHSggGBolGxUVITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGxAQGy0lHyUtLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIARMAtwMBIgACEQEDEQH/xAAcAAACAgMBAQAAAAAAAAAAAAAFBgMEAAIHAQj/xABNEAABAwEFAwkDCgMECAcBAAABAAIDEQQFEiExBkFREyJhcYGRobHBBzLRFCNCUmJykrLh8DOiwkNzgvEkRFNjk7PS4hYXNFSDo8MV/8QAGwEAAgMBAQEAAAAAAAAAAAAAAgMBBAUABgf/xAA2EQABBAAEAggFAwMFAAAAAAABAAIDEQQSITFBYQUTIlFxgbHBFKHR4fAykfFCYuIjM1Jyov/aAAwDAQACEQMRAD8AK2izWfEwxxgc4nCcqDcr9y2OEzYnMeOblTRA27RNdQcmXE9ARm47UTFI8sLcFVnNyuP2XtJWPbGQb7t+9Xr6umAxUbEWudq8rl94xEAg05riBQLpFnvblxgxE9G9IN92bCX1P0jlv1QTa6pmBD22x518/dZs0w8rGWuAdVOF/wBnkxtcTV1El3E+jmkjQ5J8vk1LC76vFdFRYUeIsTNPIpQvyVxkFKty0rr0qnZ5ZAfeKJ2yMyYn1oRlQ6qpECEtw1VhlZaVptqkpx7Ftc14PEubGuy4Irs1fYjD2GBsgOedKjvUlnnhfaC4R8mNw3JjW7G/z0VdzyMzSzTvvfy3STfVscZnFzaGumibfZ7dzLY5wkya0aVzKVdpzW0P8Fb2aLg5oEhjqc3A0KhhAfqLRStc6IhpymtD3Jp2p2HhaXOjJoNc6ohY/ZfZZIWOxuDi0EkU1I4IbOIc2Pne4D7W9X7rtZa3C21uzyAq3IblYaGZjbVQkGI6oBsmo45d/kud3/s2+C1Gzgg5ijtBnpXgVXn2ftDGGQxHADQkZhHbdbXxSzRCRs2PNznZuB0yPGi1G0E/yV9ma9uAZGo59DqKpBy2dxv3fsroaaGxOlnUeJA4cglEBN2zdmc6N2F4diBGE9CVKK9ds+F1c+w0KWDqmNboQrVqs7mgjDmN/opbltPIPjtAqMLwT1aOHaKodabUTWrna717BMcNNQdxRMJBsKJMruye5fRLGNngLDQte2nWHDJcFtNhMMr4jqxxHccvBdW9mN6cpZmsJzZzD2e74US57TbrwWpsoGUgz625HwovQRODjpsdV4bERmKQsPApSgjWK9HHQLFZVcqCF7WuYWtAIGoKM3feDiyUYqVNKVSrTIdCJQZMHTmV5Rrivo0kYI1/NbRGwYonBzTQ9a3s0Qle90lHZ6KtbmUa1w3q9s9YxWprzt6PkkvIDS/irhs0IacLBXcituiDhFXh6LDHE1pqQUdhbHSM5aKw1lghZs0+WjR4+iRLZZ2hzxTM6KKG6qtqnK8rA18g0zGVAqdnhbG6jiBTcckkt1TW4u2WN0qPuoiNzmuoQFUuNxADnGoJ3pnt0TXFzQ7CDr1INe1niijaI3VzGfFRlrVWo5c4o8eXJLV+OxTOW1icQ4Be2oVkqiFwXW6Z5wkJQsuVgkNZZ2CivAc4qCzREvbQFFb7u90RIcMwiOyd6hmGIxNeC4GuVQjy9ujolGQhmZuvmk+02ciVwoqzm5OXTrxdETOBCATQg5VGWvgudWuLDjBNVz2ZV0UmcbV/FoUprKM15GypoiVjul7sxTvQVacKGpQ2dmZUtlZUU0Ri3XNIOdQaduSF2eIggEb0wAjRJcQTafdgpfk8+CtQ8DvGnhVO23l3ctZS4Cpjo8dW/wAEuxvbyUUjIw1zCCezVdAgwyR01Dm+BC2Ijka3kvKdJtuTPVX7aelLiEz6NWKPaCExTvi+q4js3eC9V4nXRZobYVGGMlp4K/OKMHUpbJZCKtI1U9tc0twgZheYDaC+hOfZpUbTaC5jG9KM3NK8DJ4FNx3KtdlhDqOdioDkBTPtKMi7I64gHAkZ5/orEWGkeMyoYjG4dhMROo5WtrZETAMIBdiqXb9UbsVgc+AEkAgKpBYgY+TrTpRm67vcGYQ6uXUm9Q8bj5rNmxkZb2Xag9x9wtrvc7FGXYKDKvYkn2l2p0c9WuBrQ5bugp0nuuVoyLT2n4JD2h2VtMshcA2nS8/BKdHKWVlKZg5IGzdY57QKI4fVArotrpZWhx1IBRbaSWNpEYbvGar3Vshao34nBtBwcCpdp7uOJskj44/vPA04DUoBHIGHslaRxWHLwesbX/YIbMxlSaq1sxI1s3vlo4jio4bGLQcEMsT3cMdHfhOdOlGbu2EtROKjAN3PBqh6qS7yqXYvDZSDI39wrO1DWu5+PE6lEr3ZXlG0TxPsPaX0oYwKb3n0aobD7PbQxwLnx0HBzz/QjfG9zrpV2YzDMZl6wfnggUrnOc7MknLVby7EWp2WEc7MZhM7NjpGkkyM13An0RJ0EjAKTOxN30qO6qa3Dud+oH9wq8nScTa6t7fMO9ly+99jbVZ243tGEbwaoJZ53NORIXXL4fJNHycj3UOtA0eiAwXJDGxzMAdi+k7NwpwIpRc7AuJ7O3NFF01CGf6mp/tBr50lKe0vJzJFQvLtYXOG+hTW6xsJzY3LiAfNELtsDnnDHhrrQOY3tpUJjMGQbcUuTpeMjsNPidPqidgsUkjGHAaEUNAfFNVyROYwMcDzcgTvG5Ldjhlgccy0kZ0IPSPVFruvCQyNa91Qa7hrTLRXMtbLGxGIMumlJJ9qt2YLQycDKRtD1t/TyWJ52yuj5VZi0e8C1zT20PgSsTY3AtVJc6gjNcR4KuGt5xOeaIxisZ4oeIswOKwivdNNkoy0NwtwigoMuvP1Vy0MIGJVo2ZgdQ7lft45rW8XALYaMrAOS8bM+5XOHEn1W75GxAYnhumZIAqRXeid33ozdIw/4mpQ27k5rG8XOPc0j1SPyLsjnTqSJsSY3ZataWF6PE8WcuI8r+i+iIZA9uoPVRCLVHQ5LhzXOGhcOqoW0tuka1xEj8gTqdw60oYv+35/ZMPQ9aiT/wA/5I7t5tw9kjrNZ3YcGUkg96u9jTupvIzrllTPnlrmc44iTU6udUuPqVFdl0T2lxLdK5vdpXf1pli9nhcAXWhxPANFPEonyNB1KzG3WgSe99DUONRnXRP3s49oU8FojgmkxwPOE8o4czIkOD3HLMAUJ38aKnNsAwD+I+vUEq37s8+z51xMJoD6EKGStJ0XPjflsjRfXDJmlocCCDodyhmtsQGcjB1vaPVfPmy8xNmZXq7svRXyRVcZaOytxdGNe0OLzry+661bL9s4y5ePscD5INab8hLg0StJcaCm88NFzmQKZri0xPA92Rteomi4Yk9wTT0VEGk5iT5eXDvTXeV7RxuLXyYTStMyaHTQdCCS35CdHOd2AeZVTbuP56MjPE2mW+hcfVBLNZXHU07ye4KJsTI15aKT8F0fh5IGyOBsjv07k0Q37Z/pMef8TR5BXLkt2O0FuENAoQBXQilCTrvSo+FgaSDU0OvVwRS4p6WhrvrNafL9VEU73PAcUeNwsbIXGNtH7hdFtTaOaeOXfULeJ+FwdwNVravdaeB+HwWOCvhebYU2wuq0FeKlcs4MYbWpbkfRYkopG5HlpXO7Gzm04qKzwVlA4K3C2jgFNZ4QC5yzWiyAvXOky2V7ZhV471ctArLE3pr3ZqCwtq5Tk1nH2Wny/VbLt148apX27krIBwZ+Y/ohNnFQwZDIZnQKztfNincOFB3N/VVYZ2kNGIZADUDRZcxuRy9bgW5YGjl6ova7mkEYcW4szUChAG4+aXrws7eSeaZ080w2i9scRipRtAG0PDjxqh0ULXkMcKtcQCDUDwNUhmfXNuijMgjcZfl3b9/8c1FstGGwM3A596b4G80ZJWishZCxoYX0aBSuEaak6qa5rPMDm0RiujXvezsLwE2hZKwXNqgjVtGHN1AOnJK+0kTZInAUIpXuV+87ule7EMDy3QPDnN3fRHbn0d2kthfybjI1oNKc2oBHUdFArdOj1NFA9n2UszBTj4OKtVXt2xgMDaULQGkVqKjPEOsOC0IoSERPFacI7AHJekqxGMTCBwy6xmFWerF3vp2qB3JrtBaIX+4OZZpenD+Nh+Cj2ZEbpRylagEjTBkDXF2LLXnYv7p47muw+RS8bUG1o7UUNN4O5Di+1ysBIwcWfDviuqLm+/uiV+RtEz2NaA2tABnlTI131GfaobtfnCetvdX9ELdbTuA7c1dsT+Y0/Vf50PoUEGjh5K1iGVBl309vdddHOhB4gHvH6rK7/wB5qO5TisrehtPw5ei3j0H70yWyF40CiQrNwnBI77VfDRYtYLO41LSMli4gK7JCyUhxcAaCF26IVqGkLWRgDK0zPrkiEkTpHAV0Wl8x4GAdKycP2pAOavTzVHl40VRuwZlbWV1ZJHdFO8/oqUlpwgBpFSUFl+WtcXQyNcD9BzQAf31rXcdVjsYd0u7QW8cvJnmHO8/8kObaQd6bZb5Hu22w5b3Boe3ucPIlTQXLc1q9yXkHncHmI/gky7lQfhiSSHey3YukmsaGuYdBWhv6JOaUTuNrn2iGPEaFwJz+rU+iP2z2XvaMcNtZg/3jaD8bTTwQu444rHaeVntlneGAgCJzpXYjlo1uW9A3DyZgCOKdJ0lA6J1O1o0K4+iZXuEb3V3FQR217ufgq2tGtBAdQauOLil+XauJ9pMdfezaTl1g10RT5AHuElXHL3MTgwjqBpXpXPbldRWVYIu+70UxvGQuxNjLQDniLcxTcB00UN43hiAGE5qL/wDkMLmveygaagYnHMaEmuaH3veObg0itDnuFEB3pPYO0va1blkontzqlaybSvNGkUJ+lXLronix7D3hMxsjORLHCrXcsHNIO8FjSCmOjeNKVxmMw9Xn+R+n27kNetI5QDqjzPZtbj780LOrHJ6Bbf8Alw4e/aq/djDfNxXCCU7D5hceksK3QvvwB+yr2FvKRWiEZlwq3rLQR/MkokLp9zbNtgdiEz5DSlHYeNdwQK89mrIx73vJFXE4S6jRU1oBwTJMK94bwIVaDpOKJ8lAkGiOGtUb8dEkGXOjauPACpRO7bJaM6sDWkZ4jn0Gg3ow232aPmwsLzwY31XkslpkGTBEOn3lzMI1u5tdJ0rI/QAAfv6/RdE2OdWzkcCR3ivqrbN/Qf19VyVt2hpxyPqeJOXimTZ/aqGIGN3KPJNRgbirlQila7grOYDdZfVEkubqma8Zw17QcVC3cTuJ/RYobTJywa4MewiuTwAaGm4E07VioTPGc0Vs4doETQ7Q17n2TXDZMLyVDbYC40pUI3gzWroVJwwWS3EHNZStPcMbwcTM+IyKHz7KSMGOKcj7LxiHfqngQKteUZoAEynMaTZTBiS8hp18Uix2y0R5SQMlaNcDqH8D/iqN+W27jDI6WyFsmE4QWFmJ1OaMTMtab01vu0kkbykD2n23koWWWgLnuxk7wGHKnWSewFTBO97g0hNmjgDC5p18Vza1WgmjK82tabq8aL2B1AoHa1W7/dWmNFm3xVeI1e53YP31p7sNtnbE2SIhzXDNp+idCGnrrkUi2WKgI16V0z2Z2MWmKWHEA+NwcMtWvHjRzT+LqVXERlzARuPdFFJlOuyES3zPLzXHD1Vr46IXfMojgdQ5u5oO8118K9y6dNsE5xq5zR0t17a0XPvaTdjLPNFA1xdhjxurxeSAK9TdPtb1Vigc5wsUrjsSxrDl3SdYIzUOOlcu4pnum9bTCfmZ5IhvDHUBrxGhQCHUDh3DJXI5StdjQBSzMxtOH/jC1uFH2iQ9TsJ/loq0t5ukNDM9xpUgvcT15lLE1ooCa6KCxPc12L6R1PAHd5KriYGOBIGv5wWlgca6N7WkCrHAWOd76c7T/s7bGMtMZLgMTXNdnvOYr3JlZs/ZnullLA8uOIFxJFCTo3TeFyiyuIcCNQQfFdGgtThGwg8R/mqmFd2SOad0tGetD+8ehKkvO0RQHA2N26gY3LPTRQsui3ze6xkDT9J5q+h05orTtCIXfKHjEWjEObXfTUeZTrYQDG0/ZHfRW6viqsLWhtkWlC7/AGdwAh1qmkmdwB5Nnq7uITfYLks8TaQxMYPsgVPW7U9qCXleJM7Wgc0anpRC7L1GMtPFU5nNDqGyuyYeUMDgedKSexYTUhYj5jD2rEswuvQqu3F6drdWFixYrSz1iHW+JziKFEVDMKlo+15AlC5ocKKNjsptA5WkcetcR9pdpLrbICfcDWj8IcfFxX0S6zAr5r27s3J2+0sxOdSVxqTU87nUr0Vp1ALsLBleTyTZZ8zKS2x1DRSkqCRpGaka5aAVS1vDonr2RWzBbsO6SMjtBBHqkaE6j95/so5sba+Tt0Dt2MA9v7CF36SpX0LOakN46r5227t/L3haXg5coWDqiAjFOjmV7V3q2XgxnKyEikbCfAk9Wi+bMZcS52pNT1nM+KCPiuct4/3+/wB6LbEtQCa0BNAXGgJoBqTTQDLNVpJKDryCcTQQBbk4nU3DM9e4eqkc/MAcRU7teKiibQdfitpKVCA/pKYz9Q8USgPO7U9XRJis46CPED4FIMZzCdtmH1jc3o8jT1WPhDqRyXo+lG2wHn6/wjlyH+I3qPnXzCcrvlrAANakeNfVJN0upLT6zT8f6U/7KULXjgQe8f8AatAk5dFkNflbdbLW1bOxODS0lh39PTmqU2zzg/E0mnqm15Xjgqr4g5GzHTN434qldoc1tDuWK+1oXiJrSBQKqueHEmlusWLExLQXaiS0NixWd0bXA84vBORyyA31ouc3ltTeLWxnlmBxfhIaxlWCoGNwLTzaGvYup3v/AAX9Ve4hca2hmpI5Vpi69Cr2FcMuw34tafUFO2xt72qS0vZNO2WMR1bSNjA59R7rm60AdUZ6rim0F4OntEsz2hrpHlxaDUNqfdrvppVdS2HtOF7CSBRsjs8hlG4+i45I/Kp/f6q5hAcptIxZBksADwAHotJM1VjO7gpycv3VUi8B/X1qy51Uq1K9G7NWIJSxzXjVpBHYaqjVWJDkepSdQoX0Bf1JbJaSHYeUjwh1MRAkaBkKipo40FRXiFzmwbGQgNc+WR7TucBE05V+i5ziOqn3kdvO/BFdkTyC7FIyOgcGn+DIWkOINCKNOn0Ui2/aqVwDYsUOXOdjxyuyoAJcDSxoA0aAeJIoBXqQ1l/Pf9lZiMLQTILN6b/X1B8Cme+bZDY4ngOETuSkwxZMMj3xuYz5kVe4VcDykmobquZ2dmKhOYAoOveV5KACTQVOdd/Sa8VYszKNHHejjjynU2lTS5ztXcFJkOhaSkKYqrahkaa8OlOOyWFdadOkJu2Tl59OI8x8QlAFMOzM1JGHq8D+qw4DUgXq8Y0nDm+FFN9kOGZn3qd5p6p3uS04HO6W+R/UpFtPNcTwNe7NN0U4a7FqM/FaP9JWFG3N2U3x2mMgEEZrd0w0ruQqySxloI61NaLcwUOSUDYUOgp1AFSz2toGTqLEuWu3EioApVYlF6uswWmvt9E5rFGySu5Y5/CiZ1jVk0VBen8GT7p8lwnayakhzXa7ylrG4F4FQR0L5/v+28q8kAgV3pUkgG4I8Vp4LCySA5QjFjtpbDKR/wC3mH4onj1SHyNdP38O9ONi51ktUocG8lC4UIrixMNSOBA8aKfZC62EGVzQaGjQdKjV1N5zp2FWYpQ2LOduCRNhnCfqzvxSLNZ3gYi0040OHv8A1Vi59n5LY8iLCCwYnl5o1rdBpUkk4shwXYXvFDWlKZ1oBTtyAQq6bqYIXSthjiMpxOaeGeAEioHNzo3KpPWg+JzDb5qThGsI7Wnhqh0exFj5KjpHcphoSJBTFvcG00ruKW7z2RnjaXR0maB9HJ462HX/AAkp+tjmCJpe2F7RmWnDTsxBa2a3QHmsaWtP2sRHRWpyQNxDxraYMPG8Vl/bRJl/WgmwwRn/AGjXfhjc3+pKbDUV4k/AeC6Ped1xznC/EKOJ5pAOeW8FRQ7GWYADnmmWbvgAnNxTAADaS/ASXoRS5nanbhvRBsD8IcWuHZhHjqunWG44If4cbQeOrvxHNXXsaRQgEHUHMFL+Np2jdPGlPwGmrvkuSYiNa9tPRQSCrqI5tRYRDMQ33HDE0cNxb2HzQWygkmgJplkKq1JLcWZqRFAOuDH9+qs4kUuqSjmn7fmP0Q0Qv+o7uKu3dBLUfNu1Geg6fBZLGODgaK9HJKwscC4ag8V0O35kH6zQe/P1TBd8lY43fZbXsAB8kvTOrFEeLKfh5v8ASvLPfvJMEeCtK514knTtWmK4rAYacuhy/J3tHOGm40Qi85rMGYcdKb6pNZbI383HI0nfQUHYCjMexUsjQQ7G1wqDUZ9tVTIkIrKFrx/DsP8Aun0RGOKN8Y+eLRXKhHwWIM7ZG0RsLHGprUDEdK5ZrxL1/wCKsjKdWyCvJdEvu14Q0MNCTWoyyH+aTNsb7misziyV7XEgAg5jeT3DxR2/5nCQBrQaCh8+I4oHb72hBEdoihdwa+MPGeWhqNyvxjsWvOXlGiXfZ5ajaoZXWgmdwloHSkyEDA00GKtBqmp12WZufIQDp5OMeiuWK8WxtwxwRRtO6OMMHc1DpbvifXEH557v+lGGkDYIB2iSXEeRPuECkuls08rBGHRuIDsAAbhc0A5jIb0v3XeDbLLLZJXVwPOF/wBFwyBz0DqipHSujWLkLPXnFuL6xaNOHN6VVju+xEkmZxrnm5n/AEpb4y5tKwJY2kEE92x/n5pctF5wOjeH89haahjqOIpoCFI3kZomPL6NoHA0JBy0IHkjlouO7He/KM+JiB78KhguS7GMMbbYQ0mobykPNr9Xm1CQIHAInYll39VTdOTHhYMtwcwtB7TkqXyqVvMdZ2MdqSPpDPOtM0cZcd3AUN4SHrmj+CgtmzV3SODjeMooKc2WAd5wV8VPVOQsxDG7+iDudmXHLrXkt9QgBoe0ka5hGbRs3dLm0ktj3AZ5zR95o3RVmXHcI/1lh65YPgh+HNJxxjCf5Q9t7xn6Te8KvaL3ZudXqz8kfay5WDK1M7JYvQL35XdA0tLD/wDKw+ij4Vyn4yPh6fdct2ilknk5sUhaxp52B1CSQTu6FNsnYiGyPOriBTeMNcyN1cXguiz3rdQ/1ln/ABG/BVHXhdLnCkrHOJABxnFmdMhVXGNDWhvcqbnhzy69+SC0XplAoOJoKKKeShNNKqpaDUDrXEplI6MWBvMfUE5YXaVr6lULWTwI6wQnDZdwkgBeMRBIrXPKhHmmGyWRjtW5dZRdVYsFAXAa0uVWJ3zjekrs2yDq2WPoLh/O74rWO64dcAV67YWsDmNFAHmg6wD6octCkp78xQjaq9OQfHRmNz2mgqAaMIrr98LxD/aWcPyaT6sj2/jZ/wBqxUZXkPItbuCgEkDXBt735E+1KzapMT3O4k925IlvdytvA1DXeEY+NU5yyBrS46NBPcKpK2UbjnkkO7Ltcan1V3kse6Cc4hkt6LZoyWALlyV9pp/nWt+q3xcfgAq1nfkg982/FaJXDTGQOpvN9FNYLVWq4FHWiu26VrWOc7RoJ7khQWpzuVcNaZ03VP8Amj+19tpEIwffNT91ufnTuS7cGfyjpYOyhPxRkDLaVZzUqt5yHEw/Y/qeil02k8kXbg8DwQ29I+axwO6m76zj4K1djT8jnNdJWeIolVqizEOUl42v5xzaGhAr0h7ASO5yW5rIWmlMO/PLLcensUm0Y+fP3IvGCMqhG+nUuBpKebKljUjXUWmRzC9RKKUrn1XgJ3arRjVLFSuaIarqpOdktOONrjqRn1jIrZ7su1UbjfWI9Dj5A+qsyv8ANA7Qq03VoXQdi3fMuHB/m0fBOFiHN60kbDOqHt4lnjiCfWCmQT2fpCS9W4lNAec/sP8ALT0UUa3jPPd0tb4FyFySlj2qx1sbXfVmae9r2+qxX9vrKZbBMwa1jI7Hs9KrFnYiNxfYXrugZGDDEOP9R9Alvai04LM/7VG95z8AUO2JgpCX73uJ7NB6qv7Q7VRkcY1NXeTR5uRy4LPgijbwaPifEq6vLndGAq9tm5ON8h0Y1zvwglWAl/b22cnYpOLy1g7TU/ytK52gtG0WQFzQTHUqzZLVQ6oPFIXnm6fWVl4axuL3naCuleNBuVMSa0N1pDDksLyKb3/mpQ+/7wxSGpyGQ6aa+JKzZt5ItNf9ifzBVpKDpJ3lEbg/tv7l35mq4TayDdqjeFTHCfv/ANB9Sr1ztPya0cMcfiaKpbGfNs+9Jp1Rq5dAPya0jpi8ZKKK1UoLtEPngeMMJ/8ApYPRCwi+0raSR/3EXgKeiFxRkoSgO61C3FeKnjs2dO9WRG0ZUXUuCqMeRqFaZmFu1ja6Lbk6ZjRE096KkYuWvJnD9Y69QU1pc5oqW5DeM9622bjqx1Prd2Q/VFuTprTwVWV7g8r0GGwcckDSdyN/zRMWwkxD3fdB7iPiuhWa0h3QeHwXLti5gLQYwfoupnXLIjupRdAsxzCuwutlrIxMYa/KmFqlZ7w6WnwI+KHwWnjmr7HZtPWPCvoiKpELLws/KRuZxp4EH0XqlBWKMoRteW6BcS2mdy1vZFuaWt7sz4u8E+WUZLn+z45a3PlO7E78R/7h3LokIyQohqVO0rn3tbtmUMI+1Ifyt/qXQAFyj2gMfNbJKDJjWsHYMR/mce5BJZbQTY3BrrKVbsdzB2+ZUtuk0XtgsbwyoGla5jcVQnlqVVjiIkLiPDzWhPjGHCtjaddAfL70o5Xq/s+7nyDjE4fzMQtwRTZxtZHj/dP8C0+itBZF2V5bDzG11D3+UavXKf8ARrX1Q/8ANVC3ZRtJ+s7yYrGzrqwW37kR7pVIKIobtOefF/cs8HPHoqNjbkMuivXUj1RK+hjdC4j+yHhLKrVjsjjGMMIofpVdWv1+CTJKGlWYMGZQda00QyzjM9yxwUwjLSQRQ1K1wpyp6jQqIFSMAOWlcu/JaOC3h1HWELtkyPVwCO2NoY0Cue/hVUbxmJNBoFPyMo/sn56cx2fgvG3VO7+yOfEgeZVDK95sj5L0TpoY2BocBXMKzsDMW26EV1xjvjefMBdrsoXKNjrllht1me8D3idQeDD+cLuUYWjACG0QsLESNc+2m1SYDwKtWcODm5Glc+0EeqnC2Jy7R5hN4KqSrFVi8KxcoXINgrPzXyfWdQdTc/UdyeImrgl2O1HaiLQP2EsIsxC7ecszoFzcsxvfIfpFzu81S2CNyaYjVleIr3hEED3WliA/My9GP8qVyU03ZGHtlYa0Joaa5hKT8ic69PqgOwUjipKotsqPn+tjh5IM1Gdkq/KW/df+Un0XKRurW01mJbG1ozLneTfgpblsOGG1N1c6JufU9Fn2cOBI1b6jOncsuDJ0x+x5OCYGirRlU57rY3k2PYCQwdOr3nXtT5duztm5GOsTaljSc37wD9bpSze/vs+4PzOT9YP4Uf8Ads/KEGVpJsKDI9oFEjzP1XG9uoo47W+OJuEANy3e42pHQfOqANeume1OOkUbhG12ZBcRVzQQKEHdn5rl1VB0QWTupyVauUMNoiD6gYwct5BqK8BUZ9FVQqrV0D5+MHQuGW5cianiW0mR5du0HUFM2SioN5pI4LwzaogVD0Qu+2H5XCfquaO97SfJdkouAwSnGDvqjMt92g/6xN/xH/FcCu2XaAvJgcDqDOh8AuKC9J980v8AxH/FbttcjjnI89bnFTmULt4cCARoVi4m23SUHzj9PrO+KxdmUpGsxwyU7EVY2ugQmc4Xtd0gpkjdlkgC4qOGyE8AmCxj5sDWlQhMb0Tus1xN7UwJZQO520Mv30E2nsGCQPAGF/AUoRSvfr3pju5nPl++Vdvi6uWgcwe9q37w078x2oQLCK9VzdjkY2Vd/pTOp35HfBB8JBIIoRlnrluRXZg/6VF/i/5b0IRBH73tTogx7frgEbnAtdVp7lZuuYOEz2HIwuI7C3IoftS35vqlH5ZFU2YnI5du75PIadVEQNGkZTJeDweSI3s/qKebgmLrPGT9Wn4SQD3ALnBlqyM/e8wfVP2zTyYGkuLq1pXcAaYfDxUjdA7ZAvacf9Gb9/8AX0XJnLp3tWfSCH+9/wDzeuYOQu3QheBWLC+kkZ4Pb5hVgrFhbWWMcXt/MEBRtT1b20o4dR9EMfLkjUrMTS3j+wlqZ1EZROCtQv06wiTG1QaEkkAakjzTFHFQdK4JZUIhKsRMpU65HyXmNSVGE14IqUKo45LFZdosUKUpXyyoaR1fD1RKw1MbSeHlkoZGAjPdmp7C7IjgfPP4rgFCtxojdr6P62kevohjCrUEhBB4FEEKjshpJMPt+YBR2F2QQTDSWTpcD/KEXs2ilqkalLG2Nxa2iMf3jR+cevfxQDZ99LTERrU/kcunNclO99m+TlFohHMzxtH0KtIxD7Oem7q0hzeKPiodqTWKv+8b+V4QzZj+JMONmlHgPgim0X8F3Q9v9SF7MH58nWsclemrdEB3RFXbFN81GOBePBh9U67HXhm6E6HnN66Co9ewrm4nwNi4F76/hiIKadm56TsNd48clwOqitEW9p8BdZWuH0JA7soWnwdXsXKnLs21DGviLHmjXBwJ4AxvqezVcY3LnboBssARfZexGW0ADRgLz2ZCnTUhCQE6+z2zUbJKR7xDR1NzPiR3KALKY0aoqLA7c/vaUBvmyljs6Z55eOv7zTHbrm5+Nj8Ica9R6wVS2hgxR1qXFu+mu5x9VJCYUv2Z9KHgR5phE1Qlqzjd0jzCNwnmhQElysl/Spg7IqpiUzX809nmiQqSSRYqrn5rFClDHaHqPktrHqfujzKxYpCgq4FM1YsUqCpvpnqb+UIszRYsRBS1etUtq/hSfcd+UrFiJdxSttc2kbqZZsPfRA9mf4/+B/5SvFiSd0ahtjfmo/vP8o0V2decbc/3VYsULhumr2gyEWV5Bpz2jsdiaR2g0XLXaBYsUu3QjZYF0HYf/wBM37zvzFYsXN3TGbplpUPGenE8ELlzbTiDXp1XixEjKUIW5n97wi5WLEISCsapR7p/e8LFilQoH6rFixAVK//Z'
  };


  constructor() { }

  ngOnInit(): void {
  }

}

package interface_comparable_cho_lop_hinh_hoc.service;

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

package lop_circle_va_lop_cylinder.service;

public final class OnlyLetter {
    public boolean isOnlyLetters(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if (!Character.isLetter(arr[i])){
                return false;
            }
        }
        return true;
    }
}

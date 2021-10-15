package thiet_ke_va_trien_khai_lop_triangle.service;

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

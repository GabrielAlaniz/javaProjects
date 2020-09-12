package easy;

public class FindIntersection {
    public static void main(String[] args) {
        String[] strArr =  {"1, 5, 6, 7, 10, 11, 12", "5, 6, 8, 11, 17"};
        findIntersection(strArr);
    }
    
    public static String[] findIntersection(String[] strArr){
        String[] arr1 = strArr[0].split(",");
        String[] arr2 = strArr[1].split(",");
        String palabra = "";
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
               if(arr1[i].equals(arr2[j])){
                   palabra += arr1[i];
               }
            }
        }
        if(palabra.isEmpty()) palabra = "false";
        else palabra = palabra.replaceAll(" ", ",");
        
        System.out.println(palabra);
        return strArr;
    }
}

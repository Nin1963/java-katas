public class CountLetters {
    public int findLetterCount(String str, String car){
        int result = 0;

        for(int i = 0; i<str.length() ; i++ ){
            String caract = "" + str.charAt(i);
            if(car.equals(caract)){
                result += 1;
            }
        }

        return result;
    }
    
}

package Linear_search;

public class searchThroughString {
    public static void main(String[] args) {
        String name = "sajan";
        char target = 'k';

        System.out.println(linear_search(name, target));

    }
    public static int linear_search(String name, char target){

        if(name.length() == 0){
            return -1;
        }

        for(int i = 0;i<name.length();i++){
            if(target == name.charAt(i)){
                return i;
            }
        }

        return -1;
    }
}

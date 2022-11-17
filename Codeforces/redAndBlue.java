import java.net.SocketTimeoutException;

public class redAndBlue {
    public static String testCase(String input, int inputLength){
        String previous = "";
        String current = "";
        String next = "";
        String returnString = "";
        for(int i = 0; i < inputLength; i++){

            current = Character.toString(input.toCharArray()[i]);
            next = Character.toString(input.toCharArray()[(i == inputLength -1 ? i : i + 1)]);
            if(current.equals("?")){
                if(next.equals("R")){
                    System.out.println("first loop, hit R");
                     returnString += "B";
                } else if(next.equals("B")){
                    System.out.println("first loop, hit B");
                    returnString += "R";
                } else{
                    System.out.println("reached the loop");
                    for(int j = i + 1; j <= inputLength; j++){
                        System.out.println("in the loop");
                        if(j >= inputLength){
                            System.out.println("broke out");
                            break;
                        }
                        String tempCurrent = Character.toString(input.toCharArray()[j]);
                        String tempNext = Character.toString(input.toCharArray()[(j == inputLength -1 ? j : j + 1)]);
                        if(tempCurrent.equals("?")){
                            if(tempNext.equals("R")){
                                System.out.println("second loop, hit R");
                                returnString += "B";
                                break;
                            } else if(tempNext.equals("B")){
                                System.out.println("secont loop, hit B");
                                returnString += "R";
                                break;
                            }
                        }
                            
                    }
                }
            }
        

    }
    return returnString;
}

    public static void main(String[] args) {
        System.out.println(testCase("?R???BR",7));
    }
}

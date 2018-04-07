public class Main {

    private static char [][]numbers = {
            {'b','a','e','t','z','v','p','b'},
            {'h','r','m','h','r','p','e','z'},
            {'j','i','r','a','f','a','r','a'},
            {'m','r','s','b','a','n','r','s'},
            {'c','a','b','a','l','l','o','z'},
            {'z','t','o','r','t','u','g','a'},
            {'f','o','c','a','b','h','r','v'},
            {'s','n','t','m','l','e','o','n'}};

    /* This functions finds a word into a matrix and prints the position of the first letter of the word */
    private static void FindWord(String word){
        int i,j,k;
        int counter = 0;
        for(i=0;i<8;i++){
            for(j=0;j<8;j++){
                if((8-j)>=word.length()) { // verify limits in x position
                    if (numbers[i][j] == word.charAt(0)) { // find the first letter of the word into the matrix
                        for(k=0;k<word.length();k++){
                            if(numbers[i][j+k] == word.charAt(k)){ // verify if all the characters are equal in the row
                                counter++; //
                                //System.out.print(numbers[i][j+k]);
                            }
                            else{ // restart the counter if a character are unequal
                                counter = 0;
                            }
                        }
                        if(counter == word.length()){
                            System.out.println("The word " + word + " is in the" + " row= " + i + " col= " + j);
                        }
                    }
                }
                counter = 0; // restart the counter for the y case

                if((8-i)>=word.length()){ // verify limits in y position
                    if (numbers[i][j] == word.charAt(0)) { // find the first letter of the word into the matrix
                        for(k=0;k<word.length();k++){
                            if(numbers[i+k][j] == word.charAt(k)){ // verify if all the characters are equal in the col
                                counter++;
                                //System.out.print(numbers[i+k][j]);
                            }
                            else{
                                counter = 0;
                            }
                        }
                        if(counter == word.length()){
                            System.out.println("The word " + word + " is in the " + " row= " + i + " col= " + j);
                        }
                    }
                }
            }
        }
    }

    /* Crossword in x and y position*/
    public static void main(String[] args) {
        FindWord("perro");
    }

}


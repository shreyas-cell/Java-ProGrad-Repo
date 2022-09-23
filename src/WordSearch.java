public class WordSearch {
    public static void main(String[] args) {
        Character [][]board={{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        String word="ABCB";
        word=word.toLowerCase();
        //String c=Character.toString(word.charAt(0));

        for(int row=0;row<board.length;row++){
            for(int column=0;column< board[row].length;column++){
                if (board[row][column]==word.charAt(0)){
                    if(buildWord(board,row,column,0,word)){
                        System.out.println("true");
                        System.exit(0);
                    }
                    if (word.length()==1) {
                        System.out.println("true");
                        System.exit(0);
                    }


                }
            }
        }
        System.out.println("false");

    }
    static boolean buildWord(Character [][]board,int row,int column,int position,String word){
        if(row<0||row>= board.length||column<0||column>= board[0].length){
            return false;
        }
        if(position==word.length())
            return true;

        if (word.charAt(position)!=board[row][column])
            return false;
        Character originalBoard=board[row][column];
        board[row][column]='0';
        boolean result=buildWord(board,row+1,column,position+1,word)
                ||buildWord(board,row-1,column,position+1,word)
                ||buildWord(board,row,column+1,position+1,word)
                ||buildWord(board,row,column-1,position+1,word);
        board[row][column]=originalBoard;
        return result;
    }
}

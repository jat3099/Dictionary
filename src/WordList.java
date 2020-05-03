import org.w3c.dom.Node;
//class that creates and maintain a linked list of words and their meaning
 class WordList {


    WordMeaningNode listWord;

    WordList(){

        listWord=null;
    }

    public void append(WordMeaning word){

        WordMeaningNode node = new WordMeaningNode(word);
        if( listWord ==null) {
            listWord= node;

        }//end of if
        else{

            WordMeaningNode current= listWord , back =null;
            WordMeaningNode prev;
            boolean found=false;

            while (current !=null && !found){
                if(node.Word.getWord().compareToIgnoreCase(current.Word.getWord()) <0)
                    found= true;
                else{
                    back = current;
                    current = current.next;
                }

                node.next= current;

                if(back==null)
                    listWord = node;
                else
                    back.next =  node;
            }
        }//end of else

    }//end of method

    public String toString(){

        String result="";

        WordMeaningNode current = listWord;

        while (current !=null)
        {

            result +=  current.Word.getWord() + " definition -->" + current.Word.getMeaning() + "\n" ;
            current = current.next;

        }
        return result ;
    }


}//end of class

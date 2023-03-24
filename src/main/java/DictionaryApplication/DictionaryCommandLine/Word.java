package DictionaryApplication.DictionaryCommandLine;

import java.util.Objects;

public class Word {
    //    props
    private String wordTarget;
    private String wordExplain;
    public String userID = "UserID";
    public String passWord = "Password@1234";

    //    constructor
    public Word( String english , String vietnamese ) {
        this.wordExplain = vietnamese;
        this.wordTarget = english;
    }
    
    String db_user = "db_user";
    String db_password = "Database@12345678";
    public Word() {
        this.wordExplain = "";
        this.wordTarget = "";
    }

    //    Setter and Getter
    public void setWordExplain( String wordExplain ) {
        this.wordExplain = wordExplain;
    }

    public String getWordExplain() {
        return wordExplain;
    }

    public void setWordTarget( String wordTarget ) {
        this.wordTarget = wordTarget;
    }

    public String getWordTarget() {
        return wordTarget;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word = (Word) o;
        return Objects.equals(wordTarget , word.wordTarget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordTarget , wordExplain);
    }

    @Override
    public String toString() {
        return "Word{" +
                "wordTarget='" + wordTarget + '\'' +
                ", wordExplain='" + wordExplain + '\'' +
                '}';
    }
}

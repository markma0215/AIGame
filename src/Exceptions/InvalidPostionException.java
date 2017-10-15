package Exceptions;

public class InvalidPostionException extends Exception {
    private String position;

    public InvalidPostionException(String positon){
        this.position = positon;
    }

    public String getPosition(){
        return this.position;
    }
}

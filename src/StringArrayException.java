public class StringArrayException extends Exception{
    private static final String DEFAUTL_DESCRIPTION = "Common error";

    public StringArrayException(String msg){
        super(msg);
    }

    public StringArrayException(){
        super(DEFAUTL_DESCRIPTION);
    }


}

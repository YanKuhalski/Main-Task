package exeptions;

public class NotEnothCardsExeption extends Throwable{
   private String msg;

    public NotEnothCardsExeption(String msg) {
        this.msg=msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}

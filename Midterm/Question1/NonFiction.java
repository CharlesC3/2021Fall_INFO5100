package Question1;

public class NonFiction extends Book implements iBorrowable{
    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    String description() {
        return this.getTitle() + " all events are true and based on real facts.";
    }

    @Override
    public void setBorrowDate(int day) {
        this.borrowDate = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.returnDate = day;
    }

    @Override
    public boolean isAvailable(int day) {
        if(borrowDate <= day && day <= returnDate) return false;
        return true;
    }
}


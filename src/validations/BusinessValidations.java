package validations;

public class BusinessValidations extends RuntimeException {

    public BusinessValidations() {

    }

    public BusinessValidations(String msg) {
        super(msg);
    }

}
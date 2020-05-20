package bootcamp.data;

import java.util.Optional;

public class Result<T> {
    private final Status status;
    private final String message;
    private final Optional<T> value;

    //TODO constructor. Use overloading. 3 constructors

    public Result() {
        this.status = Status.SUCCESS;
        this.message = "";
        this.value = Optional.empty();
    }

    public Result(Optional<T> value) {
        this.status = Status.SUCCESS;
        this.message = "";
        this.value = value;
    }

    public Result(String message, Status status) {
        this.status=status;
        this.message=message;
        this.value = Optional.empty();
    }



    //1. With argument of type T indicating success and the return value. Status is set to success, message to empty string and value to the argument.
    //2. With status and message. value set to empty optional. Status and message set to corresponding arguments.
    //3. No arguments. Implies success with no return value. status set to success, message to empty string and value to empty Optional.


    public Status getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Optional<T> getValue() {
        return value;
    }
}
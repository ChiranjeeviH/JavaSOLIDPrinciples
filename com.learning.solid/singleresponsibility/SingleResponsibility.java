/*
First principle of SOLID principle is Single Responsibility
 */
//before applying Single reponsibility
class User{
    private int userId;
    private String userName;

    //save user
    public void saveUserInfo(){

    }

    //sent successufl use creation mail
    public void sendEmail(){

    }
}

//After applying single responsibility
class User{
    private int userId;
    private String userName;
}
class UserRepository{
        //save user
        public void saveUserInfo(){

        }
}
class UserEmailService{
    //sent successufl use creation mail
    public void sendEmail(){
    }
}


public class SingleResponsibility{

    public static void main(String[] args) {
        //User class should be responsibile for single purpose instead of doing multiple functionalities
        User user = new User();
        user.sendEmail();
        user.saveUserInfo();
    }
}
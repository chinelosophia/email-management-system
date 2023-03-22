//import controller.UserController;
//import dtos.request.RegisterRequest;
//
//import javax.swing.*;
//
//public class Main {
    //public static void main(String[] args) {
//        private static  UserController userController= new UserController();
//        private static final EmailController emailController=new EmailController();
//        public static void main(String [] args){
//            startApp();
//    }
//    private static void startApp() {
//            String message = """
//                    Hi Welcome,select from the option below::
//                    1 -> Register
//                    2 -> Send Email
//                    3 -> Find Email
//                    4 -> Find Email
//                    5 -> exit
//                    """;
//            String input = input (message);
//            switch (input.charAt(0)){
//                case '1' -> register();
//                case '2' -> createEmail();
//                case '3' -> findEmail();
//                case '4' -> sendEmail();
//                case '5' -> deleteEmail();
//                case '6' -> exit();
//                default -> {
//                    display("Invalid input try again");
//                    startApp();
//                }
//
//            }
//    }
//
//    private static void exit() {
//            display("GoodBye");
//            System.exit(1);
//    }
//
//    private static void display(String message) {
//        JOptionPane.showMessageDialog(null,message);
//    }
//
//    private static void register() {
//        RegisterRequest request = new RegisterRequest();
//        request.setFirstName("Enter first name:: ");
//        request.setLastName("Enter last name:: ");
//        request.setUserName("Enter Username:: ");
//        request.setPassword("Enter Password:: ");
//        var result = userController.register(request);
//        display(result.toString());
//        startApp();
//    }
//
//    private static void deleteEmail() {
//    }
//
//    private static void sendEmail() {
//    }
//
//    private static void findEmail() {
//    }
//
//    private static void createEmail() {
//            String subject = input("subject::? ");
//            String body = input("Body::? ");
//            int id = Integer.parseInt(input("id::? "));
//            var post = emailController.createEmail(subject,body,id);
//            display(email.toString());
//            startApp();
//    }
//
//    private static String input(String dialogue) {
//            return JOptionPane.showInputDialog(dialogue);
//    }
//
//}
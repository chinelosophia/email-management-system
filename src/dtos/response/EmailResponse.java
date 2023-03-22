package dtos.response;

public class EmailResponse {
   private String Subject;
   private String body;
   private String userId;
   private String receiverEmail;
   private String dateRegistered;

   public String getReceiverEmail() {
      return receiverEmail;
   }

   public void setReceiverEmail(String receiverEmail) {
      this.receiverEmail = receiverEmail;
   }

   public String getSubject() {
      return Subject;
   }

   public void setSubject(String subject) {
      Subject = subject;
   }

   public String getBody() {
      return body;
   }

   public void setBody(String body) {
      this.body = body;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getDateRegistered() {
      return dateRegistered;
   }

   public void setDateRegistered(String dateRegistered) {
      this.dateRegistered = dateRegistered;
   }
}

package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.callCenter;

public class Call<handler, Caller> {

   private Rank rank;
   private Caller caller;
   private Employee handler;
//   public Call(Caller c){
//       rank = Rank.Respondent;
//       caller = c;
//   }


    public void setHandler(Employee e) {  }
    public void reply(String message) { }
    public Rank getRank() { return rank;}
    public void setRank(Rank r) {rank = r; }
    public Rank incrementRank() { return rank; }
    public void disconnect() {  }
}

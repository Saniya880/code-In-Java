/*Online Learning Platform 🎓

Abstract class Course:

title, duration fields

abstract method startCourse(), endCourse()

concrete method courseDetails()

Subclasses:

VideoCourse

LiveCourse

Interface CertificateProvider with generateCertificate() method.

Only VideoCourse provides certificates.

In main method, simulate starting, ending, and generating certificates.
 */
abstract class Course{
    private String title;
    private int duration;

    public Course(String title, int duration){
        this.title= title;
        this.duration = duration;
    }
    public String getTitle(){
        return title;
    }
    public int getDuration(){
        return duration;
    }
    abstract public void startCourse();
    abstract public void endCourse();
    public String courseDetails(){
        return this.getClass().getName()+" :  Name - "+this.getTitle()+" ,Duration of course - "+this.getDuration();
    }
}
interface CertificateProvide{
    public void generateCertificate();
}
class VideoCourse extends Course implements CertificateProvide{
    public VideoCourse(String title, int duration){
        super(title,duration);
    }
    public void startCourse(){
        System.out.println(this.courseDetails()+" ,it started from 2021...");
    }
    public void endCourse(){
        System.out.println(this.getTitle()+" course end in 2024.");
    }
    public void generateCertificate(){
        System.out.println("Your are certified ... ");
    }
}
class LiveCourse extends Course{
    public LiveCourse(String title, int duration){
        super(title,duration);
    }
    public void startCourse(){
        System.out.println(this.courseDetails()+" ,it is starting from 2024.");
    }
    public void endCourse(){
        System.out.println(this.getTitle()+" course will end in 2029.");
    }
}
class Main{
    public static void main(String[]args){
        VideoCourse video = new VideoCourse("B.tech",4);
        video.startCourse();
        video.endCourse();
        video.generateCertificate();

        LiveCourse live = new LiveCourse("MBBS",5);
        live.startCourse();
        live.endCourse();
    }
}
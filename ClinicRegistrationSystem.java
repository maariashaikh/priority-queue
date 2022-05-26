import java.util.Date;
import java.util.Iterator;
        
public class ClinicRegistrationSystem {
    public static void main(String[] args){
        PriorityQueue regularReservations =  new UnsortedPriorityQueue();
        PriorityQueue emergencyReservations =  new SortedPriorityQueue();
        
        //regularReservations time, patient
        //emergencyReservations distressLevel, patient
        /*
        ▪ Patient 1- name: Alice – reservation: regular
        ▪ Patient 2- name: Bob – reservation: emergency – level: 3
        ▪ Patient 3- name: Cat – reservation: regular
        ▪ Patient 4- name: Dan – reservation: regular
        ▪ Patient 5- name: Eric – reservation: emergency – level: 1
        */
        regularReservations.insert(new Date().getTime(), "Alice");
        emergencyReservations.insert(3, "Bob");
        regularReservations.insert(new Date().getTime(), "Cat");
        regularReservations.insert(new Date().getTime(), "Dan");
        emergencyReservations.insert(1, "Eric");
        
        // emergencyReservations
        Iterator iE = emergencyReservations.iterator();
        while(iE.hasNext()){
            Entry entry = (Entry)iE.next();
            System.out.println(entry.getValue());
        }
        
        // regularReservations
        Iterator iR = regularReservations.iterator();
        while(iR.hasNext()){
            Entry entry = (Entry)iR.next();
            System.out.println(entry.getValue());
        }
        
    }
}

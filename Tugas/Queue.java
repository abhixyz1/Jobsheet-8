package Tugas;

/**
 * @author Abhinaya
 */
public class Queue {
    Pasien[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n){
        max = n;
        antrian = new Pasien[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if(size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max){
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Pasien data){
        if(IsFull()){
            System.out.println("Antrian sudah penuh");
        } else {
            if(IsEmpty()){
                front = rear = 0;
            } else {
                if(rear == max - 1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = data;
            size++;
        }
    }

    public Pasien Dequeue(){
        Pasien data = new Pasien();
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            data = antrian[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            } else {
                if(front == max - 1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public void print(){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while(i != rear){
                System.out.println("===================================");
                System.out.println("Antrian ke-" + (i + 1));
                System.out.println("Nama\t\t: " + antrian[i].nama);
                System.out.println("No ID\t\t: " + antrian[i].noID);
                System.out.println("Jenis Kelamin\t: " + antrian[i].jenisKelamin);
                System.out.println("Umur\t\t: " + antrian[i].umur);
                i = (i + 1) % max;
            }
        }
    }

    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan: "  + antrian[front].nama 
                    + " " + antrian[front].noID + " " + antrian[front].jenisKelamin 
                    + " " + antrian[front].umur);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen terbelakang: " + antrian[rear].nama 
                    + " " + antrian[rear].noID + " " + antrian[rear].jenisKelamin 
                    + " " + antrian[rear].umur);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(String nama){
        if(!IsEmpty()){
            for(int i = front; i <= rear; i++){
                if(antrian[i].nama.equals(nama)){
                    System.out.println("Posisi " + nama + " berada di antrian ke-" + (i + 1));
                }
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void daftarPasien(){
        if(!IsEmpty()){
            for(int i = front; i <= rear; i++){
                System.out.println("===================================");
                System.out.println("Antrian ke-" + (i + 1));
                System.out.println("Nama\t\t: " + antrian[i].nama);
                System.out.println("No ID\t\t: " + antrian[i].noID);
                System.out.println("Jenis Kelamin\t: " + antrian[i].jenisKelamin);
                System.out.println("Umur\t\t: " + antrian[i].umur);
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
}

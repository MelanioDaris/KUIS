/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Main  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JobApplication job;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String name;
        boolean inputHandler = false;
        double inputData;
        int pilihan, menu = 1;
        
        System.out.println("Terdapat 3 posisi yang kosong");
        System.out.println("   1. Programmer");
        System.out.println("   2. Designer");
        System.out.println("   3. Manager");
        System.out.print("Pilih pekerjaan yang dilamar: ");
        pilihan = input.nextInt();
        
        System.out.println("=== FORMULIR PELAMAR ===");
        System.out.print("Nama Lengkap: ");
        name = input2.nextLine();
        job = new JobApplication(name);
        
        switch(pilihan){
            case 1:
                while(!inputHandler){
                    System.out.println("Programming Knowledge");
                    System.out.print("Input : ");
                    inputData = input.nextDouble();
                    inputHandler = job.ProgrammingKnowledge(inputData);  
                }
                inputHandler = false;

                while(!inputHandler){
                    System.out.println("Clean Coding");
                    System.out.print("Input : ");
                    inputData = input.nextDouble();
                    inputHandler = job.CleanCoding(inputData);

                }
                inputHandler = false;

                while(!inputHandler){
                    System.out.println("Debugging");
                    System.out.print("Input : ");
                    inputData = input.nextDouble();
                    inputHandler = job.Debugging(inputData);
                }
                break;
            
            case 2:
                while(!inputHandler){
                    System.out.println("Design Portofolio");
                    System.out.print("Input : ");
                    inputData = input.nextDouble();
                    inputHandler = job.designPortofolio(inputData);  
                }
                inputHandler = false;

                while(!inputHandler){
                    System.out.println("Prototyping");
                    System.out.print("Input : ");
                    inputData = input.nextDouble();
                    inputHandler = job.Prototyping(inputData);

                }
                inputHandler = false;

                while(!inputHandler){
                    System.out.println("Creativity");
                    System.out.print("Input : ");
                    inputData = input.nextDouble();
                    inputHandler = job.Creativity(inputData);
                }
                break;
            
            case 3:
                while(!inputHandler){
                    System.out.println("Innovation");
                    System.out.print("Input : ");
                    inputData = input.nextDouble();
                    inputHandler = job.Innovation(inputData);  
                }
                inputHandler = false;

                while(!inputHandler){
                    System.out.println("Decision Making");
                    System.out.print("Input : ");
                    inputData = input.nextDouble();
                    inputHandler = job.DecisionMaking(inputData);

                }
                inputHandler = false;

                while(!inputHandler){
                    System.out.println("Communication");
                    System.out.print("Input : ");
                    inputData = input.nextDouble();
                    inputHandler = job.Communication(inputData);
                }
                break;
            
            default:
                System.out.println("Pilihan Tidak ada");
                break;
        }
        
        
        
        
        do{
            inputHandler = false;
            System.out.println("+++ MENU +++");
            System.out.println("  1. Tampilkan hasil");
            System.out.println("  2. Ubah Nilai Pelamar");
            System.out.println("  3. keluar");
            System.out.print("Pilih: ");
            menu = input.nextInt();
            
            if(menu==1){
                String keputusan = job.keputusan()>=85? "DITERIMA" : "DITOLAK";
                System.out.println("Nilai Akhir : " + job.keputusan());
                System.out.println("KETERANGAN : " + keputusan);
            }if(menu==2){
                switch(pilihan){
                case 1:
                    while(!inputHandler){
                        System.out.println("Programming Knowledge");
                        System.out.print("Input : ");
                        inputData = input.nextDouble();
                        inputHandler = job.ProgrammingKnowledge(inputData);  
                    }
                    inputHandler = false;

                    while(!inputHandler){
                        System.out.println("Clean Coding");
                        System.out.print("Input : ");
                        inputData = input.nextDouble();
                        inputHandler = job.CleanCoding(inputData);

                    }
                    inputHandler = false;

                    while(!inputHandler){
                        System.out.println("Debugging");
                        System.out.print("Input : ");
                        inputData = input.nextDouble();
                        inputHandler = job.Debugging(inputData);
                    }
                    break;

                case 2:
                    while(!inputHandler){
                        System.out.println("Design Portofolio");
                        System.out.print("Input : ");
                        inputData = input.nextDouble();
                        inputHandler = job.designPortofolio(inputData);  
                    }
                    inputHandler = false;

                    while(!inputHandler){
                        System.out.println("Prototyping");
                        System.out.print("Input : ");
                        inputData = input.nextDouble();
                        inputHandler = job.Prototyping(inputData);

                    }
                    inputHandler = false;

                    while(!inputHandler){
                        System.out.println("Creativity");
                        System.out.print("Input : ");
                        inputData = input.nextDouble();
                        inputHandler = job.Creativity(inputData);
                    }
                    break;

                case 3:
                    while(!inputHandler){
                        System.out.println("Innovation");
                        System.out.print("Input : ");
                        inputData = input.nextDouble();
                        inputHandler = job.Innovation(inputData);  
                    }
                    inputHandler = false;

                    while(!inputHandler){
                        System.out.println("Decision Making");
                        System.out.print("Input : ");
                        inputData = input.nextDouble();
                        inputHandler = job.DecisionMaking(inputData);

                    }
                    inputHandler = false;

                    while(!inputHandler){
                        System.out.println("Communication");
                        System.out.print("Input : ");
                        inputData = input.nextDouble();
                        inputHandler = job.Communication(inputData);
                    }
                    break;

                default:
                    System.out.println("Pilihan Tidak ada");
                    break;
            }
            }
        }while(menu != 3);
        
        
        
        
    }
    
}

/*
So a strand of DNA could look something like ACGAATTCCG.

Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
So for example:

ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by 3.
ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.
*/

public class DNA {

  public static void main(String[] args) {

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    
    String dna = dna2;

    int length_of_dna = dna.length();
    System.out.println("Length: "+ length_of_dna);

    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);

    int end = dna.indexOf("TGA");
    System.out.println("End: " + end);

    // Remember that the indexOf() string method will return -1 if the substring doesn’t exist within a String.
    if (start != -1 && end != -1){
      System.out.println("Conditions not satisfied.");
    }
    // Add a third condition that checks whether or not that the number of nucleotides in between the start codon and the stop condon is a multiple of 3.
    if (start != -1 && end != -1 && (end - start) % 3 == 0){
      System.out.print("Nope!");

      String protein = dna.substring(start, end+3); 
      System.out.println("Protein: " + protein);
    } else {
      System.out.println("No protein");

    }


    }

}

import java.util.Bitset;
public class CompressedGene {
    private Bitset bitset;
    private int length;
    
    private void compress(String gene) {
        length = gene.length();
    bitSet = new BitSet(length * 2);
// convert to upper case for consistency
final String upperGene = gene.toUpperCase();
// convert String to bit representation
for (int i = 0; i < length; i++) {
final int firstLocation = 2 * i;
final int secondLocation = 2 * i + 1;
switch (upperGene.charAt(i)) {
case 'A': // 00 are next two bits
bitSet.set(firstLocation, false);
bitSet.set(secondLocation, false);
break;
case 'C': // 01 are next two bits
bitSet.set(firstLocation, false);
bitSet.set(secondLocation, true);
break;
case 'G': // 10 are next two bits
bitSet.set(firstLocation, true);
bitSet.set(secondLocation, false);
break;
case 'T': // 11 are next two bits
bitSet.set(firstLocation, true);
bitSet.set(secondLocation, true);
break;
default:
throw new IllegalArgumentException("The provided gene String
contains characters other than ACGT");
}
}
}
public CompressedGene(String gene){
    compress(gene);
}

}

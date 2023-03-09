/**
 * @author anant
 * @created 09/03/2023 - 9:46
 * @project Latihan1
 */
public class Makanan extends Hidangan{
    @Override
    public String disantap() {
        return this.getNamaHidangan() + "dimakan";
    }
}

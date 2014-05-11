import java.util.Random;

/*main de sadece randomValueControl metotunu kullancag�z.
* bundan return olan deger rakamlar� farkl� 4basamakl� say�d�r.
* bu metot RandomValueProduce metotunu i�inde bulunduruyor. RandomValueProduce metotu ise random deger uretir.*/
public class RandomValue {
private int value=0;
public RandomValue()
{

}
public int randomValueControl()//bu metotun amac� say� i�inde ayn� olan rakam varsa o say�y� degi�tirip tekrar random deger atar.
{
boolean son=true;
RandomValueProduce();
do
{
son=true;
String [] series=new String[4];

int lenght=4;
for(int i=3;i>=0;i--)
{
series[i]=(Integer.toString(value).substring(lenght-1,lenght));
lenght--;
}
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
if(series[j].equals(series[i]) && i!=j)
{
son=RandomValueProduce();
break;
}

}
if(son==false)
break;

}
//System.err.println(value);//bu sat�r� comment den c�kar�rsak consol ekran�nda random say�n�n ka� oldugu yazar.
}while(son==false);

return value;
}
private boolean RandomValueProduce() {
Random rnd = new Random();
        value = rnd.nextInt(9000)+1000;
return false;
}
public int getValeu() {
return value;
}
public void setValue(int value) {
this.value = value;
}
}

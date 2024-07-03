package Live;
import Music.*;
import Music.wind.*;
import Music.string.*;
class Tests
{
	public static void main(String args[])
	{
		veena v=new veena();
		v.play();
		saxophone s=new saxophone();
		s.play();
		playable p;
		p=v;
		playable s;
		p=s;
		p.play();
	}
}
public class Complex {
    
    int img;
    int real;

    Complex(int _img, int _real)
    {
        img = _img;
        real = _real;
    }

    Complex Add(int number, Complex comp)
    {
        Complex c = new Complex(number+comp.real, comp.img);
        return c;
    }

    Complex Add(Complex c1, Complex c2)
    {
        Complex c = new Complex(c1.real+c2.real, c1.img+c2.img);
        return c;
    }

    void Display()
    {
        System.out.println(real+""+img+"i");
    }

}

#include <iostream>
#include <string>

using namespace std; 

enum COLOR{ Green, Blue, White, Black, Brown};


class Animal{

    public:
        Animal(): _name("unknown"){
            cout << "constructing Animal object" << _name << endl;
        }

        //Q2
        Animal(string n, COLOR c){
            _name = n;
            _color = c;
            cout << "The name is " <<  _name << endl;

            switch(_color){
                case 0:
                    cout << "The color is Green"<< endl;
                    break;
                case 1:
                    cout << "The color is Blue"<< endl;
                    break;
                case 2:
                    cout << "The color is White"<< endl;
                    break;
                case 3:
                    cout << "The color is Black"<< endl;
                    break;
                case 4:
                    cout << "The color is Brown"<< endl;
                    break;
            }
        }

        ~Animal(){
            cout << "destructing Animal object " << _name << endl;
        }

        virtual void speak(){
            cout << "Animal speaks" << endl;
        }

        virtual void move() = 0;

    private:
        string _name;
        COLOR _color;
};


class Mammal:public Animal {

    public:
        void eat() const{
            cout << "Mammal eat " << endl;
        }

        Mammal() : Animal()
        {
            cout << "Constructing Mammal Object" << endl;
        }

        Mammal(string n, COLOR c) : Animal(n,c)
        {
            _name = n;
        }

        ~Mammal(){
            cout << "destructing Mammal object " << _name << endl;
        }

        void move(){
            cout << "move is called by Mammal " << _name << endl;
        }

        void speak(){
            cout << "Animal speaks" << endl;
        }

    private:
        string _name;
        COLOR _color;

};

class Dog : public Mammal {

    public:

        Dog() : Mammal()
        {
            cout << "Constructing Dog Object" << endl;
        }

        Dog(string n, COLOR c, string ownername) : Mammal(n,c)
        {
            _name = n;
            owner = ownername;
            cout << "constructing Dog object " << _name << endl;
        }

        ~Dog(){
            cout << "destructing Dog object " << _name << endl;
        }

        void speak(){
            cout << "Woof" << endl;
        }

    private:
        string _name;
        COLOR _color;
        string owner;
};


class Cat : public Mammal  {
    public:
        Cat():Mammal(){}

        Cat(string n, COLOR c) : Mammal(n,c)
        {
            _name = n;
        }

        ~Cat(){
            cout << "destructing Cat object" << _name << endl;
        }

        void speak(){
            cout << "Meow by "<< _name << endl;
        }

        void move(){
            cout << "Cat is moving by" << _name << endl;
        }

    private:
        string _name;
        COLOR _color;
};

class Lion : public Mammal {
    public:
        Lion() : Mammal(){}

        Lion(string n, COLOR c) : Mammal(n,c)
        {
            _name = n;
        }

        ~Lion(){
            cout << "destructing Lion object " << _name << endl;
        }

        void speak(){
            cout << "Roar by " << _name << endl;
        }

        void move(){
            cout << "Lion is moving by" << _name << endl;
        }
    private:
        string _name;
        COLOR _color;
};

int main(){

    // Part 1 

    // Animal a("Sheep", COLOR::Green );
    // a.speak();

    // Mammal b("Panda", COLOR::Black);
    // b.speak();

    // Dog c("Poodle", COLOR::Brown, "C");
    // c.speak();
    // cout << "Program exiting..." << endl;


    // // Part 2
    // Mammal *b = new Mammal("Panda", Black);
    // b->speak();

    
    // Dog *c = new Dog("Poodle", Brown, "C");
    // c->speak();
    // c->move();

    // //destructors
    // delete b;
    // delete c;
    // cout << "Program exiting..." << endl;

    // Part 3 
    // Animal *animalPtr = new Dog("Lassie", White, "Andy");
    // animalPtr->speak();
    // animalPtr->move();
    // delete animalPtr;

    // // Part 4
    // Dog dogi("Lassie", White, "Andy");
    // Mammal *aniPtr  = &dogi ;
    // Mammal &aniRef = dogi;
    // Mammal aniVal = dogi;

    // aniPtr->speak();
    //     aniRef.speak();
    //         aniVal.speak();
    // cout << "Program exiting..." << endl;

    /*  ZOO PART ()*/


    // IMPT *****************
    Mammal **Zoo = new Mammal*[30];   // IMPT ***************************
  
    int choice = 0;
    int slot = 0;

    while( choice < 5)
    {
        cout << "Select the animal to send to Zoo:" << endl;
        cout << "(1) Dog  (2) Cat  (3) Lion  (4) Move all animals  (5) Quit" << endl;
        cin >> choice;

        switch(choice)
        {
            case 1:
                Zoo[slot] = new Dog();
                slot++;
                break;
            case 2:
                Zoo[slot] = new Cat();
                slot++;
                break;
            case 3:
                Zoo[slot] = new Lion();
                slot++;
                break;
            case 4:
                for(int i = 0; i<slot; i++)
                {
                    Zoo[i]->move();
                    Zoo[i]->speak();
                    Zoo[i]-> eat();
                }
        }
        
    }

    //// Delete pointers
    // for(int i =0; i<slot ; i++){
    //     delete Zoo[i];
    // }
    // delete []Zoo;
   
    cout << "Program exiting..." << endl;
    return 0;
}
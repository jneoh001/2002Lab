   Mammal *b = new Mammal("Panda", Black);
    b->speak();

    
    Dog *c = new Dog("Poodle", Brown, "C");
    c->speak();
    c->move();

    //destructors
    delete b;
    delete c;
    cout << "Program exiting..." << endl;
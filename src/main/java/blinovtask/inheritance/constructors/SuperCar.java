package blinovtask.inheritance.constructors;

    public abstract class SuperCar extends Car {
        public SuperCar (String model) {
            super(model);// //так как в классе-родителе Car нет конструктора по умолчанию,
// нужно явно вызвать через super другой конструктор с параметрами.
            super.wheelCount = 3;
        }

    }


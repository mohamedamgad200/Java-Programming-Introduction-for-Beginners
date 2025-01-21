public class EnumDemo {
    ComputerType myComputerType=ComputerType.TABLET;
    String description=switch (myComputerType){
        case ComputerType.SMARTPHONE->"Smartphones offer computing power in your hand.";
        case ComputerType.TABLET ->"Tablets are lightweight for browsing and light tasks.";
        case ComputerType.LABTOP ->"Laptops are portable for work on the go.";
        case ComputerType.DESKTOP -> "Desktops excel in gaming and work related tasks.";
        default -> "Unknown computer type.";
    };
}

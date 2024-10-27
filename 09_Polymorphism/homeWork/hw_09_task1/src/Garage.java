public final class Garage
{
    private Garage() {}

    public static void operateVehicle(Vehicle vehicle)
    {
        Tuple<Boolean, String> moving = vehicle.move();
        System.out.println(moving.getSecond());
        if (!moving.getFirst())
        {
            if (vehicle instanceof IMotorized)
            {
                Tuple<Boolean, String> started = ((IMotorized) vehicle).start();
                System.out.println(started.getSecond());
                if (started.getFirst())
                    operateVehicle(vehicle);
            }
        }
    }


}

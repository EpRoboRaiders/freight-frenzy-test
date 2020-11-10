package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "WobbleGoal", group = "Autonomous")
//@Disabled
public class WobbleGoalPlacement extends AutonomousBase {

    static final double FORWARD_SPEED = 0.3;

    @Override
    public void runOpMode(){

        initialize();

        encoderDrive(.1, 88, 88, 88, 88, 5);

        rotate(.2, -45);

        encoderDrive(.1, 10,10,10,10,5);

        encoderDrive(.1, -16, -16, -16, -16, 5);
    }
}


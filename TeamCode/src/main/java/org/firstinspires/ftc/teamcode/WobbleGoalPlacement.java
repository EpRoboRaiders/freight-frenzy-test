package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "WobbleGoal", group = "Autonomous")
//@Disabled
public class WobbleGoalPlacement extends LinearOpMode {

    RobotTemplate robot = new RobotTemplate();
    private ElapsedTime runtime = new ElapsedTime();

    static final double FORWARD_SPEED = 0.6;

    @Override
    public void runOpMode(){

        /*
         * Initialize the drive system variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Ready to run");    //
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // Step through each leg of the path, ensuring that the Auto mode has not been stopped along the way

        // Drive forward for 3 seconds
        robot.leftFrontDrive.setPower(FORWARD_SPEED);
        robot.rightFrontDrive.setPower(FORWARD_SPEED);
        robot.leftBackDrive.setPower(FORWARD_SPEED);
        robot.rightBackDrive.setPower(FORWARD_SPEED);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        sleep(1000);

        robot.leftFrontDrive.setPower(.5);
        robot.leftBackDrive.setPower(.5);
        robot.rightFrontDrive.setPower(-.5);
        robot.rightBackDrive.setPower(-.5);

        robot.leftFrontDrive.setPower(0);
        robot.rightFrontDrive.setPower(0);
        robot.leftBackDrive.setPower(0);
        robot.rightBackDrive.setPower(0);

        telemetry.addData("Path", "Complete");
        telemetry.update();
        sleep(1000);

    }
}



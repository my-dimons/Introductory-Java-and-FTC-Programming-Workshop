package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="Robot: Teleop Tank", group="Robot")
public class tankDriveTeleop extends OpMode {

    private DcMotor frontRightMotor   = null;
    private DcMotor frontLeftMotor  = null;
    private DcMotor backRightMotor = null;
    private DcMotor backLeftMotor = null;


    @Override
    public void init() {
        frontRightMotor= hardwareMap.get(DcMotor.class, "frontR");
        frontLeftMotor = hardwareMap.get(DcMotor.class, "frontL");
        backRightMotor = hardwareMap.get(DcMotor.class, "backR");
        backLeftMotor = hardwareMap.get(DcMotor.class, "backL");

        frontRightMotor.setDirection(DcMotor.Direction.FORWARD);
        frontLeftMotor.setDirection(DcMotor.Direction.REVERSE);
        backRightMotor.setDirection(DcMotor.Direction.REVERSE);
        backLeftMotor.setDirection(DcMotor.Direction.FORWARD);

        frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    @Override
    public void loop() {
        double drive = -gamepad1.left_stick_y;
        double strafe  =  gamepad1.left_stick_x;
        double turn = gamepad1.right_stick_x;

        double max = Math.max(Math.abs(drive), Math.abs(strafe));
        if (max > 1.0)
        {
            drive /= max;
            strafe /= max;
        }

        // turn MAY work (probably not)
        double frontRight = drive + strafe + turn;
        double frontLeft  = drive - strafe - turn;
        double rearRight  = drive + strafe - turn;
        double rearLeft   = drive - strafe + turn;

        frontRightMotor.setPower(frontRight);
        frontLeftMotor.setPower(frontLeft);
        backRightMotor.setPower(rearRight);
        backLeftMotor.setPower(rearLeft);
    }
}

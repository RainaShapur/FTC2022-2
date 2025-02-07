/*package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.matrices.OpenGLMatrix;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackableDefaultListener;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackables;

@Autonomous (name = "Vuforia")
public class Vuforia extends LinearOpMode
{
 VuforiaLocalizer vurforiaLocalizer;
 VuforiaLocalizer.Parameters parameters;
 //VuforiaTrackables visionTargets = //vuforiaLocalizer.loa;
 VuforiaTrackable target;
 VuforiaTrackableDefaultListener listener;

 OpenGLMatrix lastknownLocation;
 OpenGLMatrix driverhubLocation;

 public static final String VUFORIA_KEY = "AQFvn1X/////AAABmfD5QbW72U/KuuZnETqfRvxtsghR7zWjrmjy6vu4H4g1VnCMWG5HPq3XhUD1kyMrbjP5lRruLzhYzgHtr9dK4TCjv0K0GTEK8Ww52Y++exIFmBRDTm84bjzBw0CPo0oeSx82fTU+c0S8B5Q4QFYWSCP5FD1pJESKDz3H5WnA0LoEFMkjpjwhMEbYqpVW6PdvO+QqSHBKBQjzKKstLDbEiZI+7A+A++dEaNehTtpy3cL3Jz0Jui6w6Fu3M/Dij9EwVHJTEEOJS4LEQdDV4U3lfkAuVxVxb0SGChr/1qcd+YzKQ/Cv3a5rKmMja54LkCfQ2dgRI3FapdPVZglZ2rr1nc0KTKI5T+Q3lzzhpc1brGZS";
 //need key

 public void runOpMode () throws InterruptedException
 {


  waitForStart();

  while(opModeIsActive())
  {


   telemetry.update();
   idle();
  }
 }

 public void setupVuforia()
 {

  parameters = new VuforiaLocalizer.Parameters(R.id.cameraMonitorViewId);
  parameters.vuforiaLicenseKey = VUFORIA_KEY;
  parameters.cameraDirection = VuforiaLocalizer.CameraDirection.BACK;
 // vuforiaLocalizer = ClassFactory.createVuforiaLocalizer(parameters);

 }
}
*/


# PathPlanner
![Path Editor](https://i.imgur.com/ELUBEW3.png)
## What makes PathPlanner different?
Path Planner is a motion profile generator for FRC robots created by team 3015. Every path allows for manual tuning of the robot position and the curve radius at every point. It allows you to create the perfect path for your robot quicker and easier than other generators. Path Planner can handle more complex paths than other generators because it will slow down the robot as it heads into a turn instead of going through it as fast as possible. Path Planner has a tab-based layout in which every tab has it's own path editor for different FRC games, sou you can easily edit paths for previous robots if needed. Each tab can support different robot settings so you can generate paths for different games just by switching tabs. Inspiration came from [Vannaka's Generator](https://github.com/vannaka/Motion_Profile_Generator). We used it during the 2018 season but struggled to create complex paths that the robot could follow accurately due to the high speed turns. The generation code was taken from an older, unfinished generator and fixed/modified. I can't find it on GitHub anymore :( The program should work on Windows, Mac OS, and Linux. A new update will be released whenever a major problem is fixed or if I've made changes and don't know what to add or fix anymore. ¯\\\_(ツ)\_/¯

## Working With Paths
![Point Configuration](https://i.imgur.com/dxrpN8w.png)
Paths consist of two types of points: anchor and control points. Anchor points are points that *anchor* the path. They are points that the path will pass directly through. Control points are points that are attached to each anchor point. Control points can be used to fine-tune the curve of a path by pulling the path towards it. Anchor points, as well as their corresponding control points, can be added by right clicking anywhere on the field. They can be removed by middle click or by control/command + right clicking on the anchor point that you wish to remove. Any point on the path can be moved by dragging it around, or you can right click on any anchor point to enter a position or change the angle manually. Wile holding down the shift key an dragging a control point, its angle will be locked. When you are done editing the path, it can be saved and other paths can be loaded with the buttons in the bottom left corner. Your robot settings can be updated, or the path can be generated for use on the robot or previewed in real time with the buttons in the bottom right corner. It is assumed that each anchor point represents the center of the robot. This is reflected in the path preview and start/end points.

## Robot Configuration Variables
![Robot Config Vars](https://i.imgur.com/uzKuzzH.png)
* **Max Velocity:** Maximum velocity of robot in ft/s
* **Max Acceleration:** Maximum acceleration of robot in ft/s<sup>2</sup>
* **Max Deceleration:** Maximum deceleration of robot in ft/s<sup>2</sup>
* **Wheelbase Width:** The width of the robot's drive train in ft, used for splitting the left and right paths.
* **Robot Length:** The length of the robot. This is used to draw the robot in the path preview and at the start/end points of the path
* **Time Step:** The amount of time between each point in a profile in seconds

**Settings default to last used values for the current game**

## Output Configuration Variables
![Output Config Vars](https://i.imgur.com/HrsIVQA.png)
* **Path Name:** The name of the path. Underscores are assumed for CSV files and Python arrays while camel case is assumed for Java and C++ arrays
* **Value 1, 2, and 3:** The output values for the path in order. Value choices are: position, velocity, acceleration, time, and none
* **Output Format:** The format that the path is output to. Options are CSV file, Java array, or C++ array. CSV files are saved to a chosen location and arrays are copied to the clipboard
* **Reversed:** Should the robot drive backwards

**Settings default to last used values for the current game**

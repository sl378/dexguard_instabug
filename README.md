# dexguard_instabug
Recreating instabug theming issue when dexguard obfuscation is turned on

#Release Signing
Please feel free to find the key specified in `gradle.properties` and replace it as I'm yet to master how to independently distribute the signing configuration.

#Dexguard
I did not include the library in the public repo.It's should be located in the project root directory named`/dexguard/dexguard-7.0.24/`

#Instabug customization guidelines


	If you're using the new AppCompat v7 r21 support library to implement Material design, then we'll find the color in `android:name="colorPrimary"` and use it to color the ActionBar. Your theme should be extending the Theme.AppCompat themes. If your theme extends one of the no ActionBar themes like Theme.AppCompat.NoActionBar, then we'll use the new Toolbar to add an ActionBar only for the InstabugAnnotationActivity. Please make sure you still set the colorPrimary attribute for your theme so we can use it.
	All icons are masked using the title text view color.
	If you want to set a specific primary (ActionBar and Bottom bar color) and secondary color (Icons color) you can always use the appropriate method in the Instabug class.
	If you're still using the Holo themes, then we'll use the following attributes to match your experience:

	actionBarStyle
	background: used for styling the action bar
	backgroundSplit: used for styling the bottom bar
	titleTextStyle
	textColor: used for coloring action icons in the action bar and bottom bar
	Make sure your theme contains the above style definitions.

#Screenshots
##Debug
![alt tag](https://github.com/sl378/dexguard_instabug/blob/master/release.png)
##Release
![alt tag](https://github.com/sl378/dexguard_instabug/blob/master/debuge.png)
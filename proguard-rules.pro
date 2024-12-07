# Suppress warnings for javax.annotation
-dontwarn javax.annotation.**
# Keep referenced classes to prevent stripping
-keep class org.lwjgl.util.tinyfd.** { *; }
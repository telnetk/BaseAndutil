
# Created by https://www.gitignore.io/api/test,maven,intellij
# Edit at https://www.gitignore.io/?templates=test,maven,intellij

### Intellij ###
# Covers JetBrains IDEs: IntelliJ, RubyMine, PhpStorm, AppCode, PyCharm, CLion, Android Studio and WebStorm
# Reference: https://intellij-support.jetbrains.com/hc/en-us/articles/206544839

# User-specific stuff
.idea/**/workspace.xml
.idea/**/tasks.xml
.idea/**/usage.statistics.xml
.idea/**/dictionaries
.idea/**/shelf

# Generated files
.idea/**/contentModel.xml

# Sensitive or high-churn files
.idea/**/dataSources/
.idea/**/dataSources.ids
.idea/**/dataSources.local.xml
.idea/**/sqlDataSources.xml
.idea/**/dynamic.xml
.idea/**/uiDesigner.xml
.idea/**/dbnavigator.xml

# Gradle
.idea/**/gradle.xml
.idea/**/libraries

# Gradle and Maven with auto-import
# When using Gradle or Maven with auto-import, you should exclude module files,
# since they will be recreated, and may cause churn.  Uncomment if using
# auto-import.
# .idea/modules.xml
# .idea/*.iml
# .idea/modules
# *.iml
# *.ipr

# CMake
cmake-build-*/

# Mongo Explorer plugin
.idea/**/mongoSettings.xml

# File-based project format
*.iws

# IntelliJ
out/

# mpeltonen/sbt-idea plugin
.idea_modules/

# JIRA plugin
atlassian-ide-plugin.xml

# Cursive Clojure plugin
.idea/replstate.xml

# Crashlytics plugin (for Android Studio and IntelliJ)
com_crashlytics_export_strings.xml
crashlytics.properties
crashlytics-build.properties
fabric.properties

# Editor-based Rest Client
.idea/httpRequests

# Android studio 3.1+ serialized cache file
.idea/caches/build_file_checksums.ser

### Intellij Patch ###
# Comment Reason: https://github.com/joeblau/gitignore.io/issues/186#issuecomment-215987721

# *.iml
# modules.xml
# .idea/misc.xml
# *.ipr

# Sonarlint plugin
.idea/**/sonarlint/

# SonarQube Plugin
.idea/**/sonarIssues.xml

# Markdown Navigator plugin
.idea/**/markdown-navigator.xml
.idea/**/markdown-navigator/

### Maven ###
target/
pom.xml.tag
pom.xml.releaseBackup
pom.xml.versionsBackup
pom.xml.next
release.properties
dependency-reduced-pom.xml
buildNumber.properties
.mvn/timing.properties
.mvn/wrapper/maven-wrapper.jar
.flattened-pom.xml

### Test ###
### Ignore all files that could be used to test your code and
### you wouldn't want to push

# Reference https://en.wikipedia.org/wiki/Metasyntactic_variable

# Most common
*foo
*bar
*fubar
*foobar
*baz

# Less common
*qux
*quux
*bongo
*bazola
*ztesch

# UK, Australia
*wibble
*wobble
*wubble
*flob
*blep
*blah
*boop
*beep

# Japanese
*hoge
*piyo
*fuga
*hogera
*hogehoge

# Portugal, Spain
*fulano
*sicrano
*beltrano
*mengano
*perengano
*zutano

# France, Italy, the Netherlands
*toto
*titi
*tata
*tutu
*pipppo
*pluto
*paperino
*aap
*noot
*mies

# Other names that would make sense
*tests
*testsdir
*testsfile
*testsfiles
*test
*testdir
*testfile
*testfiles
*testing
*testingdir
*testingfile
*testingfiles
*temp
*tempdir
*tempfile
*tempfiles
*tmp
*tmpdir
*tmpfile
*tmpfiles
*lol

# End of https://www.gitignore.io/api/test,maven,intellij
import jetbrains.buildServer.configs.kotlin.v2018_2.*

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2018.2"

project {

    features {
        feature {
            id = "PROJECT_EXT_4"
            type = "OAuthProvider"
            param("clientId", "2850ba8ee5156b065a16")
            param("defaultTokenScope", "public_repo,repo,repo:status,write:repo_hook")
            param("secure:clientSecret", "credentialsJSON:3f93a15b-b5df-4881-83e5-cac0b98fd319")
            param("displayName", "GitHub.com")
            param("gitHubUrl", "https://github.com/")
            param("providerType", "GitHub")
        }
    }
}

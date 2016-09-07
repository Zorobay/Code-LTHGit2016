# Code-LTHGit2016

What you should do first is to click the `fork` button on this repo on Github.

This is a line that I'm changing just because.
## Common commands:
READMEREADME
* `git clone https://github.com/YourGithubUsername/Code-LTHGit2016.git` to clone this entire repo (your fork) into a directory on your computer.
* `git status` to check how badly things are going. If you don't know what command to run, run this one.
* `git add .` (note the period) adds all changed files to the "index", making them ready to be committed.
* `git commit -m "Insert commit message here (including quotes)"` creates a commit with the currently `add`ed files.
* `escape:q!` if you're stuck in vim and don't know how to get out.
* `git push` uploads your changes to the default remote (repo) (see `git remote --help` for more info on that).
* `git pull` to download changes in the repo.
* `git stash` then `git pull` then `git stash pop` if you're in the middle of changing something but still want to pull.
* `git diff` to show line changes you've made.

## Harder tricks:

These aren't recommended for beginners. If you want to learn about these please ask.

* Branches. It's a bit like having multiple repos in the same repo, that you can compare and merge changes between. Or rather, repos are more like branches in different locations.
* `git add -i` Interactive adding of changes. Lets you add only parts of files which makes it much easier to contain specific changes in a single commit.
* `git cherry-pick` For grabbing a commit from some branch and applying on top of the current branch. Great for when you forget to branch or when you want a specific feature from another branch. This is amazing but doesn't always work the way you intend, especially with too broad commits.
* `git reset HEAD~x` Unstages the `x` latest commits. If you by accident commited something that you didnt want to inclue in your commit. If you want to delete your last commit, the safe way is `git reset HEAD~1` followed by `git stash`. The dangerous, not recoverable way is: `git reset --hard HEAD~1` (Not recommended if you do not know what you are doing).

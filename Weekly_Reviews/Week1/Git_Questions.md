# Git Questions

> Note: Don't forget about this document. [Revature Study Guide](https://sites.google.com/revature.com/studyguide/java?authuser=0). The references in this document are from the internet through google searches. These provide additional references to the material below.

## What is version control?
Version control is the practice of tracking and managing changes to software code.

## What is the difference between a distributed version control system and a central version control system? Which one is git?
The main difference between centralized and distributed version control is that, in centralized version control, the versions are saved in the remote repository while, in distributed version control, versions can be saved in the remote repository as well as in local repositories of the local machines.

Git is a distributed version control system [git-scm.com](https://git-scm.com)

## What is git? What is GitHub?
Git is a popular distributed version control system used to track and manage changes to software coode.

GitHub is a code hosting platform for version control and collaboration. [Github Docs](https://docs.github.com/en/get-started/quickstart/hello-world)

## Explain the following git commands and what they do:
### git pull
	
* Fetch and merge any commits from the tracking remote branch

```
➜  BattleOfArrayLists git:(dev) git pull
```

### git push

* Transmit local branch commits to the remote repository branch\

```
➜  BattleOfArrayLists git:(dev) git push
```

### git add [file]

* Fetch and merge any commits from the tracking remote branch
* Requires a file or files argument. The asterisk(*) will add all changed documents in the current directory and subdirectory.

```
➜  BattleOfArrayLists git:(dev) git add readme.md
➜  BattleOfArrayLists git:(dev) git add index.js ../public/index.html
➜  BattleOfArrayLists git:(dev) git add *
```


### git commit

* Commit your staged content as a new commit snapshot
* Requires a message (-m) tag.

```
➜  BattleOfArrayLists git:(dev) git commit -m 'your commit message here.'

// You can also commit and add * files at the same time
➜  BattleOfArrayLists git:(dev) git commit -a -m 'you message here'
```

###git status

* Show the modified files in working directory that are staged for the next commit.

```
➜  BattleOfArrayLists git:(dev) git status
On branch dev
Your branch is up to date with 'origin/dev'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   ../Review Questions - W1.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	../../../.DS_Store
	../../.DS_Store

no changes added to commit (use "git add" and/or "git commit -a")
```

### git log

* Shows all commits in the current branch’s history

```
➜  BattleOfArrayLists git:(dev) git log

commit 96f20044b196ea26b37c8f56915974baa130a975
Author: Azhya Knox <56852910+aaknox@users.noreply.github.com>
Date:   Wed Apr 13 19:31:45 2022 -0500

    Create .gitkeep

commit eb603d84428656caabe6e602154311a0cefaf6cf
Author: Azhya Knox <56852910+aaknox@users.noreply.github.com>
Date:   Wed Apr 13 19:31:05 2022 -0500

    Update README.md

commit 37265092bace8cf55a0111b10e249edd3f8d4296
Author: Azhya Knox <56852910+aaknox@users.noreply.github.com>
Date:   Wed Apr 13 19:29:00 2022 -0500

    Create README.md
:
```
> Type 'q' to leave the log screen

### git branch

* list your branches. a * will appear next to the currently active branch

```
➜  BattleOfArrayLists git:(dev) git branch
* dev
  main
(END)

:
```
> Type 'q' to leave the branch screen

### git remote

* returns the remote alias
* with `git remote add [alias] [url]`you can add a git URL as an alias 

```
➜  BattleOfArrayLists git:(dev) git remote
origin
```

### git clone [url]

* retrieve an entire repository from a hosted location via URL

```
➜  BattleOfArrayLists git:(dev) git clone https://github.com/220418-UTA-SH-Java-Enterprise/calvin_raines_p0.git
```

### git init

* initialize an existing directory as a Git repository

```
➜  BattleOfArrayLists git:(dev) git init
```

[Git Cheatsheet](https://education.github.com/git-cheat-sheet-education.pdf)
## Explain the typical git workflow (like if you want to submit a new Java class from your local repo to the remote repo on GitHub).

> also can be asked as: "What is basic snapshotting in Git?"

1. git pull - make sure that your current working directory is up too date.
2. git add [files] - this git command will add the desired files to the staging area.
3. git status - it is a good idea to check the staging area prio to your commit to ensure the intended filles are in the staging area for the next commit.
4. git add or git rm to adjust the staging area as needed.
5. git commit -m 'a message describing the changes you have made.' 

[git-scm](https://git-scm.com/book/en/v2/Appendix-C%3A-Git-Commands-Basic-Snapshotting)

## What is a branch? How do you make your own branch?

* A branch is a parallel version of a repository. It is contained within the repository, but does not affect the primary or main branch allowing you to work freely without disrupting the "live" version. When you've made the changes you want to make, you can merge your branch back into the main branch to publish your changes.

```
git checkout -B branch-name
```

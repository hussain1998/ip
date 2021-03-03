# Duke User Guide
This is a Command Line Interface (CLI) application for managing tasks. It allows users to add and manage their various types of tasks.

## Features
### Notes about command format:
- Words in UPPER_CASE are the parameters to be supplied by the user. 
    - e.g. in `todo DESCRIPTION`, DESCRIPTION is a parameter which can be used 
      as `todo CS2113T Quiz`.

### Adding a Todo task : `todo`
Adds a Todo task to the task list.
Format: `todo DESCRIPTION`
Example:
- `todo Study for midterms`

Expected outcome:
	
  `Added: [T][ ] Study for midterms`

### Adding a Deadline task : `deadline`
Adds a Deadlne task to the task list.
Format: `deadline DESCRIPTION /by END_TIME`

Example:
- `deadline Study for midterms /by this thursday`

Expected outcome:
	
  `Added: [D][ ] Study for midterms (by: this thursday)`

### Adding a Event task : `event`
Adds a Event task to the task list.
Format: `event DESCRIPTION /at EVENT_TIME`

Example:
- `event Midterms /at this friday`

Expected outcome:
	
  `Added: [E][ ] Midterms (at: this friday)`

























### Markdown

Markdown is a lightweight and easy-to-use syntax for styling your writing. It includes conventions for

```markdown
Syntax highlighted code block

# Header 1
## Header 2
### Header 3

- Bulleted
- List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/hussain1998/ip/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://docs.github.com/categories/github-pages-basics/) or [contact support](https://support.github.com/contact) and we’ll help you sort it out.

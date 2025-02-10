# TODO
## Digistore 24
Ja, bei Digistore24 können Sie beim Verkauf automatisch Lizenzschlüssel generieren und per E-Mail an Ihre Kunden versenden. Dazu bietet Digistore24 drei Methoden an:
1.	Lizenzschlüssel von Digistore24 generiert: Digistore24 erstellt für jede Bestellung einen eindeutigen, zufälligen Lizenzschlüssel und übermittelt diesen an Ihr System zur Verifizierung. Ihre Software muss in der Lage sein, diesen Schlüssel zu akzeptieren und zu überprüfen.  ￼
2.	Ihr eigener Lizenzserver: Sie richten einen eigenen Lizenzserver ein, von dem Digistore24 für jede Bestellung einen Lizenzschlüssel anfordert. Dies ermöglicht es Ihnen, kundenspezifische Daten in den Schlüssel zu integrieren. Ihr Server muss dafür über eine HTTP-Schnittstelle erreichbar sein.  ￼
3.	Schlüsselliste: Sie stellen Digistore24 eine Liste mit vorab generierten Lizenzschlüsseln zur Verfügung. Für jede Bestellung wird ein Schlüssel aus dieser Liste entnommen und an den Kunden übermittelt. Sie müssen sicherstellen, dass die Liste stets ausreichend gefüllt ist.  ￼

Die Lizenzschlüssel werden nach dem Kauf automatisch per E-Mail an die Kunden versendet und auf der Bestellbestätigungsseite angezeigt. Weitere Details finden Sie in der Digistore24-Hilfe.

## Course WebService
- register page
- login page
- buy item (book, course) via digistore24, makes affiliate marketing possible
- lizenz key auf digistore24 generieren, oder via webservice hook und dann via email
- should also be used for ebooks via FreeBookReader (buying, last chapter)

## Next release
- create HTML and push it to IPFS using Pinata
- push videos and images also to IPFS using Pinata
- put the links to IPFS into HTML
- Create code to push to course webservice, to embed into a course website.
- Monetise courses
- JavaScript AJAX to trigger RESTFUL calls
- Choose template for Course creation
- Landscape mode for preview to support website building for online courses
- When saving the license we have to load project new

### App Part
- Changing Theme in settings...commented out because it is buggy
- Enable Image insert
- Enable Sound insert
- Enable Video insert
- Enable widgets toolbar
- Order for the part and pages should be alphabetically
- App description is overwritten when creating a website.
- License check via web service
- Support license cancel from user
- Download app after getting a license, send license file and download link
- Navigation should respect language, also in desktop app
- One of the worst bugs. Load file...press cmd-z and editor is empty
- Progressbar für build.
- Still the editor bug, that cursor jumps at the end of the file
- Create APK on Windows failed, we need error handling
- Watermark on non commercial version for app.
- Error when Youtube video is not found.
- Save progress of reading and load that page next time
- decision path save and reset
- Build APK has to change appId into something like at.crowdware.nocodebrowser.preCached
- Browser App does not display the right colors, when pre cached
- Theme, FontSize, FontFamily
- FontSize changeable from end user in book app

## Nice to have
- Select app.sml shall render preview for home.sml
- Select book.sml shall render preview for home.md
- Focus on Editor scrolls down
- Page title, should be displayed in navbar of the app, at least for the browser app
- Glossar for Dein Leben
- Puzzle Solve Counter, Rewards
- Reader kan join in to create chapters...
- chapter rating like / dislike
- meeting with god after finish a chapter, changes the story and also the available chapters
- Plugins for website generation, umami analytics for example
- MD syntax highlighting more detailed
- SML syntax highlighting more detailed
- Hyperlinks like buttons
- TopAppBar in app.sml
- Page: barTitle
- Credit all open source developers.
- generate PDF
- pager
- Button { link: toggleSound:on|off }
- Button { link: godot:start|stop|back }
- IconButton {}
- List { data: }
- md referenz in text
- Video Einführung
- Feature Voting via canny.io
- Syntax-edit Grammar
  - Comments are not grayed out
  - No tabs anymore
  - Cursor management when tabbed
- TestCases
  - Syntax highligt..errors
  - Grammar tests
- Import multiple assets
- New Project (Theme chooser)
- New page (Template chooser)
- Paging as navigation maybe visual paging for book content
- App.xml -> open splash screen in preview
- App.xml is delivering a list of files including timestamp (caching)
- Expressions in SML
- Settings page
    - Option to choose between local directory and local webserver via REST
    - Todo
- versioning of log file for later support
- put python install into dmg for local webserver
- Git support
- Save only when xml is valid or after a period od time
- Drag and drop tree node to editor (button) 
- WebService in KTOR also for Desktop
- Code Generator
- 
### EPUB
- part name "toc" and "pdfOnly" in docs

## Docs
- https://draft2digital.com/book/epubcheck/upload in docs

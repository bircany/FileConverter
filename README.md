# FileConverter

FileConverter is a Java project designed to convert files between different formats. It supports a variety of file types and offers an easy-to-use interface for batch file conversion.

## Features

- **Multiple Format Support**: Convert files between formats such as PDF, DOCX, TXT, PNG, JPG, and more.
- **Batch Conversion**: Convert multiple files at once to save time.
- **Simple Interface**: Easy-to-use command-line interface for quick conversions.
- **Cross-Platform**: Works on Windows, macOS, and Linux.

## Installation

To use FileConverter, clone the repository and compile the project using Maven:

```bash
git clone https://github.com/yourusername/FileConverter.git
cd FileConverter
mvn clean install

```

## Usage

After compiling the project, you can start converting files using the following command:

```bash
java -jar FileConverter.jar --input <input_file> --output <output_format>

```

### Example

To convert a PDF file to a DOCX file:

```bash
java -jar FileConverter.jar --input document.pdf --output docx

```

### Options

- **`-input`**: Path to the input file you want to convert.
- **`-output`**: Desired output file format (e.g., pdf, docx, txt, png, jpg).

## Supported Formats

- **Text Documents**: `.pdf`, `.docx`, `.txt`
- **Images**: `.png`, `.jpg`, `.jpeg`
- **Others**: More formats can be added as needed.



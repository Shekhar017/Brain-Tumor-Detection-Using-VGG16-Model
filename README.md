
# Brain Tumor Detection Using VGG16 CNN model

## Project Overview
This project aims to detect brain tumors from MRI images using a deep learning model based on the VGG16 architecture. The model is trained and evaluated to accurately classify MRI images into tumor and non-tumor categories.

## Features
- **MRI Image Preprocessing:** Enhanced image quality using histogram equalization and Gaussian smoothing.
- **Deep Learning Model:** Utilized VGG16 architecture with transfer learning for feature extraction.
- **Model Training:** Trained on labeled datasets, fine-tuned hyperparameters, and optimized for high accuracy.
- **Model Evaluation:** Assessed model performance with metrics like accuracy, precision, recall, F1-score, confusion matrices, and ROC curves.
- **Deployment:** Integrated the model into a Flask web application for real-time tumor detection and user interaction.

##Tech Stack
-HTML,CSS,JAVASCRIPT,Python, Machine Learning, VGG16 Mdoel, TensorFlow, Google Colab

## Project Structure
```
brain-tumor-detection/
│
├── data/                      # Directory containing MRI images dataset
│   ├── train/                 # Training set images
│   ├── validation/            # Validation set images
│   └── test/                  # Test set images
│
├── models/                    # Directory to save trained models
│
├── notebooks/                 # Jupyter notebooks for experimentation and analysis
│   └── Brain_Tumor_Detection.ipynb
│
├── app/                       # Flask application for deployment
│   ├── templates/             # HTML templates for the web interface
│   ├── static/                # Static files (CSS, JS, images)
│   └── app.py                 # Main Flask application script
│
├── requirements.txt           # Python dependencies
├── README.md                  # Project README file
└── train_model.py             # Script to train the VGG16 model
```

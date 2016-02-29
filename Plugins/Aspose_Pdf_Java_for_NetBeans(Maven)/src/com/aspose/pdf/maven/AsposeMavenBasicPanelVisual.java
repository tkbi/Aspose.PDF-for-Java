package com.aspose.pdf.maven;

import static com.aspose.pdf.maven.Bundle.TXT_MavenProjectName;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import org.netbeans.spi.project.ui.support.ProjectChooser;
import org.openide.WizardDescriptor;
import org.openide.WizardValidationException;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle;

/**
 * @author Adeel Ilyas <adeel.ilyas@aspose.com>
 */
public class AsposeMavenBasicPanelVisual extends JPanel implements DocumentListener {

    /**
     *
     */
    public static final String PROP_PROJECT_NAME = "projectName";

    /**
     *
     */
    public static final String PROP_GROUP_ID = "groupId";

    private AsposeMavenBasicWizardPanel panel;
    private boolean txtPackageCustom = false;

    /**
     *
     * @param panel
     */
    public AsposeMavenBasicPanelVisual(AsposeMavenBasicWizardPanel panel) {
        initComponents();
        this.panel = panel;
        // Register listener on the textFields to make the automatic updates
        projectNameTextField.getDocument().addDocumentListener(this);
        projectLocationTextField.getDocument().addDocumentListener(this);
        txtGroupId.getDocument().addDocumentListener(this);
        txtPackage.getDocument().addDocumentListener(this);
        txtVersion.getDocument().addDocumentListener(this);
        txtGroupId.setText(MavenSettings.getDefault().getLastArchetypeGroupId());
        txtVersion.setText(MavenSettings.getDefault().getLastArchetypeVersion());
    }

    /**
     *
     * @return
     */
    public String getProjectName() {
        return this.projectNameTextField.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        projectNameLabel = new javax.swing.JLabel();
        projectNameTextField = new javax.swing.JTextField();
        projectLocationLabel = new javax.swing.JLabel();
        projectLocationTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        createdFolderLabel = new javax.swing.JLabel();
        createdFolderTextField = new javax.swing.JTextField();
        lblPackage = new javax.swing.JLabel();
        txtVersion = new javax.swing.JTextField();
        lblVersion = new javax.swing.JLabel();
        txtGroupId = new javax.swing.JTextField();
        lblGroupId = new javax.swing.JLabel();
        lblArtifactId = new javax.swing.JLabel();
        txtArtifactId = new javax.swing.JTextField();
        txtPackage = new javax.swing.JTextField();
        lblPackage1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        projectNameLabel.setLabelFor(projectNameTextField);
        org.openide.awt.Mnemonics.setLocalizedText(projectNameLabel, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.projectNameLabel.text")); // NOI18N

        projectNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectNameTextFieldActionPerformed(evt);
            }
        });

        projectLocationLabel.setLabelFor(projectLocationTextField);
        org.openide.awt.Mnemonics.setLocalizedText(projectLocationLabel, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.projectLocationLabel.text")); // NOI18N

        projectLocationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectLocationTextFieldActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.browseButton.text")); // NOI18N
        browseButton.setActionCommand(org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.browseButton.actionCommand")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        createdFolderLabel.setLabelFor(createdFolderTextField);
        org.openide.awt.Mnemonics.setLocalizedText(createdFolderLabel, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.createdFolderLabel.text")); // NOI18N

        createdFolderTextField.setEditable(false);
        createdFolderTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createdFolderTextFieldActionPerformed(evt);
            }
        });

        lblPackage.setLabelFor(txtPackage);
        org.openide.awt.Mnemonics.setLocalizedText(lblPackage, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.lblPackage.text")); // NOI18N

        txtVersion.setText(org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.txtVersion.text")); // NOI18N
        txtVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVersionActionPerformed(evt);
            }
        });

        lblVersion.setLabelFor(txtVersion);
        org.openide.awt.Mnemonics.setLocalizedText(lblVersion, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.lblVersion.text")); // NOI18N

        txtGroupId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGroupIdActionPerformed(evt);
            }
        });

        lblGroupId.setLabelFor(txtGroupId);
        org.openide.awt.Mnemonics.setLocalizedText(lblGroupId, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.lblGroupId.text")); // NOI18N

        lblArtifactId.setLabelFor(txtArtifactId);
        org.openide.awt.Mnemonics.setLocalizedText(lblArtifactId, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.lblArtifactId.text")); // NOI18N

        txtArtifactId.setEditable(false);
        txtArtifactId.setEnabled(false);
        txtArtifactId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtifactIdActionPerformed(evt);
            }
        });

        txtPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPackageActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(lblPackage1, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.lblPackage1.text")); // NOI18N

        jCheckBox1.setLabel(org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.jCheckBox1.label")); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/long_banner.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.text")); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setDoubleBuffered(true);
        jLabel1.setIconTextGap(0);
        jLabel1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel1.setName(""); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentResized(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.jLabel2.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.jLabel3.text")); // NOI18N
        jLabel3.setToolTipText(org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.jLabel3.toolTipText")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGroupId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblArtifactId, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(lblPackage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(createdFolderLabel)
                            .addComponent(projectLocationLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtArtifactId)
                            .addComponent(txtGroupId)
                            .addComponent(txtVersion)
                            .addComponent(txtPackage)
                            .addComponent(createdFolderTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(projectLocationTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPackage1)
                                .addGap(31, 31, 31))
                            .addComponent(browseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(projectNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(projectNameTextField)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jCheckBox1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectNameLabel)
                    .addComponent(projectNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(projectLocationLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(projectLocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createdFolderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createdFolderLabel))
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArtifactId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArtifactId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGroupId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGroupId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVersion)
                    .addComponent(txtVersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPackage)
                        .addComponent(lblPackage1))
                    .addComponent(txtPackage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(21, 21, 21))
        );

        txtVersion.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.txtVersion.AccessibleContext.accessibleName")); // NOI18N
        txtGroupId.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.txtGroupId.AccessibleContext.accessibleName")); // NOI18N
        txtPackage.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(AsposeMavenBasicPanelVisual.class, "AsposeMavenBasicPanelVisual.txtPackage.AccessibleContext.accessibleName")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        String command = evt.getActionCommand();
        if ("BROWSE".equals(command)) {
            JFileChooser chooser = new JFileChooser();
            FileUtil.preventFileChooserSymlinkTraversal(chooser, null);
            chooser.setDialogTitle("Select Project Location");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            String path = this.projectLocationTextField.getText();
            if (path.length() > 0) {
                File f = new File(path);
                if (f.exists()) {
                    chooser.setSelectedFile(f);
                }
            }
            if (JFileChooser.APPROVE_OPTION == chooser.showOpenDialog(this)) {
                File projectDir = chooser.getSelectedFile();
                projectLocationTextField.setText(FileUtil.normalizeFile(projectDir).getAbsolutePath());
            }
            panel.fireChangeEvent();
        }

    }//GEN-LAST:event_browseButtonActionPerformed

    private void projectNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectNameTextFieldActionPerformed

    private void projectLocationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectLocationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectLocationTextFieldActionPerformed

    private void createdFolderTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createdFolderTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createdFolderTextFieldActionPerformed

    private void txtArtifactIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtifactIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArtifactIdActionPerformed

    private void txtGroupIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGroupIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGroupIdActionPerformed

    private void txtPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPackageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPackageActionPerformed

    private void txtVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVersionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVersionActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    private final ImageIcon icon = new ImageIcon(getClass().getResource("/resources/long_banner.png"));
    private void jLabel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentResized
        int labelwidth = jLabel1.getWidth();
        int labelheight = jLabel1.getHeight();
        Image img = icon.getImage();
        jLabel1.setIcon(new ImageIcon(img.getScaledInstance(labelwidth, labelheight, Image.SCALE_FAST)));
    }//GEN-LAST:event_jLabel1ComponentResized

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel createdFolderLabel;
    private javax.swing.JTextField createdFolderTextField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblArtifactId;
    private javax.swing.JLabel lblGroupId;
    private javax.swing.JLabel lblPackage;
    private javax.swing.JLabel lblPackage1;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JLabel projectLocationLabel;
    private javax.swing.JTextField projectLocationTextField;
    private javax.swing.JLabel projectNameLabel;
    private javax.swing.JTextField projectNameTextField;
    private javax.swing.JTextField txtArtifactId;
    private javax.swing.JTextField txtGroupId;
    private javax.swing.JTextField txtPackage;
    private javax.swing.JTextField txtVersion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addNotify() {
        super.addNotify();
        //same problem as in 31086, initial focus on Cancel button
        projectNameTextField.requestFocus();
    }

    boolean valid(WizardDescriptor wizardDescriptor) {

        if (projectNameTextField.getText().length() == 0) {
            // TODO if using org.openide.dialogs >= 7.8, can use WizardDescriptor.PROP_ERROR_MESSAGE:
            wizardDescriptor.putProperty("WizardPanel_errorMessage",
                    "Project Name is not a valid folder name");
            return false; // Display name not specified
        }
        File f = FileUtil.normalizeFile(new File(projectLocationTextField.getText()).getAbsoluteFile());
        if (projectLocationTextField.getText().trim().length() == 0 || !f.isDirectory()) {
            String message = "Project Folder is not a valid path";
            wizardDescriptor.putProperty("WizardPanel_errorMessage", message);
            return false;
        }
        if (txtVersion.getText().isEmpty()) {
            String message = "Version may not be empty";
            wizardDescriptor.putProperty("WizardPanel_errorMessage", message);
            return false;
        }
        if (txtGroupId.getText().isEmpty()) {
            String message = "GroupdId may not be empty";
            wizardDescriptor.putProperty("WizardPanel_errorMessage", message);
            return false;
        }

        final File destFolder = FileUtil.normalizeFile(new File(createdFolderTextField.getText()).getAbsoluteFile());

        File projLoc = destFolder;
        while (projLoc != null && !projLoc.exists()) {
            projLoc = projLoc.getParentFile();
        }
        if (projLoc == null || !projLoc.canWrite()) {
            wizardDescriptor.putProperty("WizardPanel_errorMessage",
                    "Project Folder cannot be created");
            return false;
        }

        if (FileUtil.toFileObject(projLoc) == null) {
            String message = "Project Folder is not a valid path";
            wizardDescriptor.putProperty("WizardPanel_errorMessage", message);
            return false;
        }

        File[] kids = destFolder.listFiles();
        if (destFolder.exists() && kids != null && kids.length > 0) {
            // Folder exists and is not empty
            wizardDescriptor.putProperty("WizardPanel_errorMessage",
                    "Project Folder already exists and is not empty");
            return false;
        }               
        
        String packageName = txtPackage.getText().trim();
        if (!(packageName.equals("")
				|| packageName.matches("([\\p{L}_$][\\p{L}\\p{N}_$]*\\.)*[\\p{L}_$][\\p{L}\\p{N}_$]*"))) {                        
            String message = "Package name is invalid";
            wizardDescriptor.putProperty("WizardPanel_errorMessage", message);
            return false;
        }
        
        wizardDescriptor.putProperty("WizardPanel_errorMessage", "");
        return true;
    }

    void store(WizardDescriptor d) {
        String name = projectNameTextField.getText().trim();
        String folder = createdFolderTextField.getText().trim();
        String location = projectLocationTextField.getText().trim();

        String groupId = txtGroupId.getText().trim();
        MavenSettings.getDefault().setLastArchetypeGroupId(txtGroupId.getText().trim());
        String artifactId = txtArtifactId.getText().trim();
        String version = txtVersion.getText().trim();
        MavenSettings.getDefault().setLastArchetypeVersion(txtVersion.getText().trim());
        String startjupPackage = txtPackage.getText().trim();

        boolean downloadExamples = jCheckBox1.isSelected();

        d.putProperty("projdir", new File(folder));
        d.putProperty("projdirName", folder);
        d.putProperty("projLocation", location);
        d.putProperty("name", name);

        d.putProperty("groupId", groupId);
        d.putProperty("artifactId", artifactId);
        d.putProperty("version", version);
        d.putProperty("package", startjupPackage);

        d.putProperty("downloadExamples", downloadExamples);

    }

    @NbBundle.Messages({"# {0} - project count", "TXT_MavenProjectName=asposemavenproject{0}"})
    void read(WizardDescriptor settings) {

        File projectLocation = (File) settings.getProperty("projdir");
        if (projectLocation == null || projectLocation.getParentFile() == null || !projectLocation.getParentFile().isDirectory()) {
            projectLocation = ProjectChooser.getProjectsFolder();
        } else {
            projectLocation = projectLocation.getParentFile();
        }
        this.projectLocationTextField.setText(projectLocation.getAbsolutePath());

        String projectName = (String) settings.getProperty("name");

        if (projectName == null) {
            int baseCount = 1;
            while ((projectName = validFreeProjectName(projectLocation, TXT_MavenProjectName(baseCount))) == null) {
                baseCount++;
            }
        }

        this.projectNameTextField.setText(projectName);
        this.projectNameTextField.selectAll();

        String gr = (String) settings.getProperty("groupId");
        if (gr != null) {
            txtGroupId.setText(gr);
        }
        String ver = (String) settings.getProperty("version");
        if (ver != null) {
            txtVersion.setText(ver);
        }
    }

    private String validFreeProjectName(File parentFolder, String name) {
        File file = new File(parentFolder, name);
        return file.exists() ? null : name;
    }

    void validate(WizardDescriptor d) throws WizardValidationException {
        // nothing to validate
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        updateTexts(e);
        if (this.projectNameTextField.getDocument() == e.getDocument()) {
            firePropertyChange(PROP_PROJECT_NAME, null, this.projectNameTextField.getText());
        }

        if (this.txtGroupId.getDocument() == e.getDocument()) {
            firePropertyChange(PROP_GROUP_ID, null, this.txtGroupId.getText());
        }

    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        updateTexts(e);
        if (this.projectNameTextField.getDocument() == e.getDocument()) {
            firePropertyChange(PROP_PROJECT_NAME, null, this.projectNameTextField.getText());
        }
        if (this.txtGroupId.getDocument() == e.getDocument()) {
            firePropertyChange(PROP_GROUP_ID, null, this.txtGroupId.getText());
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        updateTexts(e);
        if (this.projectNameTextField.getDocument() == e.getDocument()) {
            firePropertyChange(PROP_PROJECT_NAME, null, this.projectNameTextField.getText());
        }
        if (this.txtGroupId.getDocument() == e.getDocument()) {
            firePropertyChange(PROP_GROUP_ID, null, this.txtGroupId.getText());
        }
    }

    private void updateTexts(DocumentEvent e) {

        Document doc = e.getDocument();
        String projectName = projectNameTextField.getText();
        if (doc == txtPackage.getDocument()) {
            // Looking for a custom change in package name by the user
            txtPackageCustom = txtPackage.getText().trim().length() != 0;
        }
        if (doc == projectNameTextField.getDocument() || doc == projectLocationTextField.getDocument()) {
            // Change in the project name

            String projectFolder = projectLocationTextField.getText();
            txtArtifactId.setText(projectName);

            createdFolderTextField.setText(projectFolder + File.separatorChar + projectName);

        }
        if (!txtPackageCustom && (doc == txtGroupId.getDocument() || doc == projectNameTextField.getDocument())) {
            txtPackage.getDocument().removeDocumentListener(this);
            txtPackage.setText(getPackageName(txtGroupId.getText() + "." + txtArtifactId.getText().replace("-", "."))); //NOI18N
            txtPackage.getDocument().addDocumentListener(this);
        }
        panel.fireChangeEvent(); // Notify that the panel changed
    }

    static String getPackageName(String displayName) {
        StringBuilder builder = new StringBuilder();
        boolean firstLetter = true;
        for (int i = 0; i < displayName.length(); i++) {
            char c = displayName.charAt(i);
            if ((!firstLetter && Character.isJavaIdentifierPart(c))
                    || (firstLetter && Character.isJavaIdentifierStart(c))) {
                firstLetter = false;
                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                }
                builder.append(c);
                continue;
            }
            if (!firstLetter && c == '.') {
                firstLetter = true;
                builder.append(c);
            }
        }
        String toRet = builder.length() == 0 ? "pkg" : builder.toString(); //NOI18N
        return toRet;
    }
}

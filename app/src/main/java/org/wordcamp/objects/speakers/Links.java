
package org.wordcamp.objects.speakers;


import com.google.gson.annotations.Expose;


public class Links {

    @Expose
    private String self;
    @Expose
    private String archives;

    /**
     * 
     * @return
     *     The self
     */
    public String getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The archives
     */
    public String getArchives() {
        return archives;
    }

    /**
     * 
     * @param archives
     *     The archives
     */
    public void setArchives(String archives) {
        this.archives = archives;
    }

}
